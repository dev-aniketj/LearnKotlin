package basic_fund

fun main() {
    var i = 1
    do {
        print("$i  ")
        i++
    } while (i <= 10)

    println()

    // bcoz it runs at once.
    i = 4
    do {
        print("$i  ")
        i++
    } while (i < 0)
}