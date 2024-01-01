class Alien(name:String){
    val greeting="Poor $name"
}

fun main(){
    val alien=Alien("Mr. meeseeks")
    println(alien.greeting)
}