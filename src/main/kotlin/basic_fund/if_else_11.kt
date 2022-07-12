package basic_fund

fun main() {
    val a = 2

    val data: String = if (a == 2) {
        "Hello"
    } else {
        "World"
    }

    println(data)

    val value = if (a > 1) "ABC" else "XYZ"
    println(value)

}