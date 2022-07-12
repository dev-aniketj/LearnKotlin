package basic_fund

fun main() {
    var name: String? = "Aniket"
    name = null

//    Elvis Operator ?:

    val text = name ?: "Ayush"  //so Ayush is the default value.
    println("My name is $text.")

}