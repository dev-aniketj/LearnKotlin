package oops

fun main() {
    lateinit var obj: Any
    obj = B()
    obj.showX()

    println()

    obj = A()
    obj.showX()
    obj.showY()
}

// Parent
open class B {
    open var x = 10
    fun showX() {
        println("x = $x")
    }
}

// Child
class A : B() {
    var y = 10
    override var x = 20
    fun showY() {
        println("y = $y")
    }
}