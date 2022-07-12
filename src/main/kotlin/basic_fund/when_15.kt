package basic_fund

fun main() {
    var x: Any = 13.432f
    when (x) {
        !is Int -> println("$x is not an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above.")
    }
}