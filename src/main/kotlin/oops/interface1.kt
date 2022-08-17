package oops

interface Shape {
    fun area()    // abstract method

    fun display() {    // non-abstract method
        println("Shape interface\n")
    }
}

class Rectangle(val l: Int, val w: Int) : Shape {
    private var length: Int = l
    private var width: Int = w

    override fun area() {
        println("Area of Rectangle is : ${length * width}")
    }

    override fun display() {
        println("Class Rectangle\n")
    }
}

class Triangle(val b: Int, val h: Int) : Shape {
    private var base = b
    private var height = h
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