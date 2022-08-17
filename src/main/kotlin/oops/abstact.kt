package oops

abstract class Alpha(protected val a: Int, protected val b: Int) {
    // abstract method
    abstract fun calc()

    // non-abstract method
    fun displayA() {
        println("a = $a")
    }

    fun displayB() {
        println("b = $b")
    }
}

class Beta(a: Int, b: Int) : Alpha(a, b) {
    override fun calc() {
        println("Sum of $a and $b is : ${a + b}")
    }
}

class Gamma(a: Int, b: Int) : Alpha(a, b) {
    override fun calc() {
        println("Subtraction of $a and $b is : ${a - b}")
    }
}

fun main() {
    var obj: Alpha
    obj = Beta(10, 3)
    obj.calc()
    obj.displayA()
    obj.displayB()

    println()

    obj = Gamma(11, 4)
    obj.calc()
    obj.displayA()
    obj.displayB()
}