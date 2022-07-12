package basic_fund

fun main() {

    val cars = arrayOf("Volvo", "BWM", "Lamborghini", "Ford")
    for (x in cars) {
        print("$x   ")
    }

    println()
    for (num in 1..10) {
        print("$num   ")
    }

    println()
    for (i in 1 until 10) {
        print("$i   ")
    }

    println()
    for (i in 10 downTo 1) {
        print("$i   ")
    }

    // now we are gone to iterate the of i.
    println()
    for (i in 1..20 step 2) {
        print("$i   ")      //odd numbers
    }

    println()
    for (i in 20.downTo(2).step(2)) {
        print("$i   ")      //even numbers
    }

}