package basic_fund

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    if (a > b && a > c) {
        println("a is greater")
    } else if (b > c) {
        println("b is greater")
    } else {
        println("c is greater")
    }

}