package oops

interface Shape {
    val area: Int

    fun area()    // abstract method

    fun display() {    // non-abstract method
        println("Shape interface\n")
    }
}

class Rectangle(l: Int, w: Int) : Shape {
    private var length: Int = l
    private var width: Int = w

    override val area: Int = length * width

    override fun area() {
        println("Area of Rectangle is : $area")
    }

    override fun display() {
        println("Class Rectangle\n")
    }
}

class Triangle(private var base: Int, private var height: Int) : Shape {
    override val area: Int
        get() {
            return (base * height * 0.5).toInt()
        }

    override fun area() {
        println("Area of Triangle is : ${base * height * 0.5}")
    }

}

fun main() {
    var shape: Shape

    shape = Rectangle(4, 2)
    shape.area()
    shape.display()

    shape = Triangle(4, 5)
    shape.area()
    shape.display()
}