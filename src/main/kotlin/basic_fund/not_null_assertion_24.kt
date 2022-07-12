package basic_fund

fun main() {
//    NOT NULL Assertion !!
    var name: String? = "Aniket"

    println(name!!.lowercase()) //use of not null assertion operator

    name = null
//    println(name!!.uppercase()) -> generates Compilation error

}