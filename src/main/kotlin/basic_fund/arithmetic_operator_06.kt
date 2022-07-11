package basic_fund

// Arithmetic Operators (+,-,*,/,%)

fun main() {
    val a = 10
    var b = 4

    var result = a + b
    println("Addition : $result")
    result = a - b
    println("Subtraction : $result")
    result = a * b
    println("Multiplication : $result")
    result = a / b
    println("Division : $result")
    result = a % b
    println("Remainder : $result")

    println("--------------------------------------------------")
    val c: Double = 14.0
    b = 3
    print(c / b)
    result = (c / b).toInt()
    println(result)
}