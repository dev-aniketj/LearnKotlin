package oops

// GETTER and SETTER

fun main() {
    val car1 = Car()
    car1.maxSpeed = 120
//    car1.carModel = "M3"  - error because setter is private

    println("Owner of the car is : ${car1.owner}")
    println("My car brand is : ${car1.carBrand}")
    println("My car max speed is : ${car1.maxSpeed}")
    println("My car model is : ${car1.carModel}")

}

class Car {
    lateinit var owner: String

    //getter and setter
    var carBrand: String = "BWM"
        get() {
            return field.lowercase()
        }
    var maxSpeed: Int = 240  //default value
        get() = field
        set(value) {
            field =
                if (value > 0) value
                else throw java.lang.IllegalArgumentException("Max Speed can't be less than zero")
        }
    var carModel: String = "M5"
        private set

    init {
        this.owner = "Frank"
    }
}