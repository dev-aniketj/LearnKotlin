package basic_fund

fun main() {

    val day = readln().toInt()
    val result: String = when (day) {
        0 -> "Sunday"
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> {
            "Thursday"
        }
        5 -> "Friday"
        6 -> "Saturday"
        else -> "Invalid"
    }
    println(result)

}