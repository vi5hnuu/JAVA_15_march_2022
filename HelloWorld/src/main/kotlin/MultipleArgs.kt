class AlienSpecies(val name:String,val eyes:Int,val hands:Int,val legs:Int){
 fun describe()="$name with $eyes eyes, "+"$hands hands and $legs legs"
}

fun main(){
    val kein=AlienSpecies("Zegerian",2,2,2)
    val mortyJr=AlienSpecies("Gazorpian",2,6,2)
    println(kein.describe())
    println(mortyJr.describe())
}