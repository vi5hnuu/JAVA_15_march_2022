fun main(){
//    val whole:Int=11;
//    val fractional:Double=1.4;
//    val trueOrFalse:Boolean=true;
//    val words:String="A value";
//    var character:Char='z';
//    var lines:String="""Tripple quotes let
// |you have many lines
//        |in a string
//    """;
//    println(whole)
//    println(fractional)
//    println(trueOrFalse)
//    println(words)
//    println(character)
//    println(lines)

//    val r=multiplyByTwo(5);
//    println(r)

    sayHello()
    sayGoodBye();
    print(multiplyByThree(5))
}


fun multiplyByTwo(x:Int):Int{
    print("Inside multiply by two :")
    return x*2;
}

fun sayHello(){
    print("Hello");
}

fun sayGoodBye():Unit{
    println("GoodBye");
}

fun multiplyByThree(x:Int):Int=x*3