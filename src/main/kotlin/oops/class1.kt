package oops

fun main() {
    val person1 = Person("Aniket", "Jain")
    person1.show()
    val person2 = Person()
    person2.show()
    val person3 = Person(lastName = "Wick")
    person3.show()
}

class Person(firstName: String = "Null", lastName: String = "Empty") {
    private var firstName: String
    private var lastName: String

    // Initializer Block
    init {
        this.firstName = firstName
        this.lastName = lastName
    }

    fun show() {
        println("My name is $firstName $lastName")
    }
}