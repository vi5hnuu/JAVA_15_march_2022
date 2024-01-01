fun bmiMetric(
    weight:Double,
    height:Double
):String{
    val bmi=weight/(height*height)
    return if(bmi<18.5) "underweight"
    else if(bmi<25) "Normal weight"
    else "Overweight"
}

//fun main(){
////    val weight=72.57;
////    val height=1.727
////    val status=bmiMetric(weight,height)
////    println(status)
//
////    val i=Int.MAX_VALUE;
//////    print(i+1)
////    print(0L+i+1)
//
//}

fun main()=isOPen(6)

fun isOPen(hour:Int){
    val open=9;
    val closed=20;
    println("Operating hours : $open - $closed")
    val status=if(hour>=open && hour<=closed) true else false
    println("open :$status")
}