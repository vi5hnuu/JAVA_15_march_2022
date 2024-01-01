//fun main(){
//    for(i in 1..3)
//        println("Hello $i")
//}

//fun main(){
//    val range=1..10
//    val range1=0 until 10
//    println(range)
//    print(range1)
//}

//fun main(){
//    var sum=0;
//    for(n in 10..100)
//        sum+=n
//    println("sum = $sum")
//}

//fun showRange(r:IntProgression){
//    for(i in r)
//        print("$i ")
//    print(" // $r")
//    println()
//}
//
//fun main(){
//    showRange(1..5)
//    showRange(0 until 5)
//    showRange(5 downTo 1)
//    showRange(0..9 step 2)
//    showRange(0 until 10 step 3)
//    showRange(9 downTo  2 step 3)
//}


//fun main(){
//    val s="abc"
//    for(i in 0..s.lastIndex)
//        println(s[i]+" "+i)
//}

//fun main(){
//    val ch:Char='a'
//    println(ch+25)
//    println(ch<'z')
//}

//fun main(){
//    for(ch in "Vishnu kumar")
//        print(ch+1)
//}

//fun main(){
//    repeat(2){
//        print("hey")
//    }
//}


//fun main() {
//    inFloatRange(0.999999)
//    inFloatRange(5.0)
//    inFloatRange(10.0)
//    inFloatRange(10.0000001)
//}
//fun inFloatRange(n:Double){
//    val r=1.0..10.0
//    println("$n in $r ? ${n in r}")
//}

//fun unitFun()=Unit
//
//fun main(){
//    println(unitFun())
//    val u1:Unit= println(42);
//    println(u1)
//    val u2=println(0)
//    println(u2)
//}

//fun main(){
//    val resultt1=if(11>42) 9 else 5
//    val result2=if(1<2){
//        val a=11
//        a+42
//    }else 42
//
//    val result3= if('x'<'y') println("x<y") else println("x>y")
//
//
//    println(resultt1)
//    println(result2)
//    println(result3)
//}
fun main() {
    var i = 1
    println(i++ + ++i)
}
