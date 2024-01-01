fun main(){
//    if(1>0)
//        println("Its true")
//    else
//        println("Not true");

//    val num=10;
//    val result=if(num>100) 4 else 42
//    println(result)

    val b=1;
    println(trueOrFalse(b<3))
    println(trueOrFalse(b>=3))
}

//fun trueOrFalse(exp:Boolean):String{
//    if(exp)
//        return "its true";
//    else
//        return "Its false"
//}

fun trueOrFalse(exp:Boolean):String =if(exp) "true" else "false"
