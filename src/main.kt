fun main() {
    val song = Song(title: "War")

}

class song(
    val title : String,
    val artisi : String,
    val yearPublished : UInt,
    val playCount : UInt
){
    val isPopular : Boolean
        get() = playCount >= 1000

    fun printDescription(){
        val artist
        println("$title, performed by $artist, we released in $yearPublished years published");
    }

}