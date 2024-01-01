
import java.util.Stack;

public class EvaluteExpressions {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Usage: java EvaluteExpression \"expression\"");
            System.exit(1);
        }
        try{
            System.out.println(evaluteExpression(args[0]));
        }catch (Exception ex){
            System.out.println("Wrong expression :"+args[0]);
        }
    }

    public static int evaluteExpression(String expression){
        Stack<Integer> operandStack=new Stack<>();
        Stack<Character> operatorStack=new Stack<>();

        expression=insertBlanks(expression);
        String[] tokens=expression.split(" ");
        for(String token:tokens){
            if (token.length() == 0)
                continue;
            if(token.charAt(0)=='+' || token.charAt(0)=='-'){
                while(!operandStack.isEmpty() && (operandStack.peek()=='+' ||
                        operandStack.peek()=='-' ||operandStack.peek()=='*' ||operandStack.peek()=='/')){
                    processAnOperator(operandStack,operatorStack);
                }
                operatorStack.push(token.charAt(0));
            }else if(token.charAt(0)=='*' || token.charAt(0)=='/'){
                while (!operatorStack.isEmpty() && (operatorStack.peek()=='*' || operatorStack.peek()=='/')){
                    processAnOperator(operandStack,operatorStack);
                }
                operatorStack.push(token.charAt(0));
            }
            else if(token.trim().charAt(0)=='('){
                while(operatorStack.peek()!='('){
                    processAnOperator(operandStack,operatorStack);
                }
                operandStack.pop();
            }else{
                operandStack.push(Integer.valueOf(token));
            }
        }
        while(!operatorStack.isEmpty()){
            processAnOperator(operandStack,operatorStack);
        }
        return operandStack.pop();
    }

    public static void processAnOperator(
 Stack<Integer> operandStack, Stack<Character> operatorStack) {
         char op = operatorStack.pop();
         int op1 = operandStack.pop();
         int op2 = operandStack.pop();
         if (op == '+')
             operandStack.push(op2 + op1);
         else if (op == '−')
             operandStack.push(op2 - op1);
         else if (op == '*')
             operandStack.push(op2 * op1);
         else if (op == '/')
             operandStack.push(op2 / op1);
         }
    public static String insertBlanks(String s){
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)==')' ||s.charAt(i)=='+' ||
                    s.charAt(i)=='-' ||s.charAt(i)=='*' ||s.charAt(i)=='/'){
                result +=" "+s.charAt(i)+" ";
            }else
                result+=s.charAt(i);
        }
        return result;
    }
}
