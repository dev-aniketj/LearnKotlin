package basic_fund

fun main() {
    // TODO: Add new functions here.

    myFunc()

    sum(10, 3)

    val name = myName()
    println(name)

    val sub = subtraction(10, 2)
    println(sub)
}

// no argument with no return type
fun myFunc() {
    println("My name is Aniket.")
}

// argument with no return type
fun sum(a: Int, b: Int) {
    println("Sum is ${a + b}")
}

// no argument with return type
fun myName(): String {
    return "Aniket"
}

// argument with return type
fun subtraction(a: Int, b: Int): Int {
    return a - b
}