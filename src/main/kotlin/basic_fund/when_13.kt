package basic_fund

fun main() {

    var month = readln().toInt()
    var season: String = when (month) {
        in 3..5 -> "Spring"
        in 6..8 -> "Summer"
        in 9..11 -> "Fall"
        12, 1, 2 -> "Winter"
        else -> "Invalid Input"
    }
    println(season)

}