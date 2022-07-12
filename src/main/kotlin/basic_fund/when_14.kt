package basic_fund

fun main() {
    val age = readln().toInt()
    val msg: String = when (age) {
        in 150 downTo 21 -> "You may vote now."
        in 20 downTo 18 -> "you may drive now."
        in 0..17 -> "you are too young."
        else -> "Invalid input"
    }
    println(msg)
}