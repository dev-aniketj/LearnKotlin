package basic_fund

// Comparison Operator (==, !=, <, <=, >, >=)

fun main() {
    val a = 5
    val b = 4
    var result: Boolean = a == b
    println("isEqualTo $result")

    result = a != b
    println("isNotEqualTo $result")

    result = a < b
    println("isLessThan $result")

    result = a >= b
    println("isGreaterThanEqualTo $result")

    println("isGreaterThan ${10 > 3}")
}