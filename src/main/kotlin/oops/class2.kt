package oops

fun main() {
    val stud1 = Student("Aniket", "Jain")
    val stud2 = Student("Ayush", "Gupta")

    stud1.setAge(22)
    stud1.setHobby("Chess")
    stud2.setAge(23)
    stud2.setHobby("VolleyBall")

    stud1.aboutMe()
    stud2.aboutMe()

    val student3 = Student("Anil", "Kumar", 21, "Football")
    student3.aboutMe()

}

class Student(firstName: String, lastName: String) {
    private var firstName: String? = null
    private var lastName: String? = null
    private var age: Int? = null
    private var hobby: String? = null

    init {
        this.firstName = firstName
        this.lastName = lastName
    }

    fun setAge(age: Int) {
        this.age = age
    }

    fun setHobby(hobby: String) {
        this.hobby = hobby
    }

    fun aboutMe() {
        println("My name is $firstName $lastName.")
        println("My age is $age and Hobby is $hobby.\n")
    }

    // secondary constructor
    constructor(firstName: String, lastName: String, age: Int, hobby: String)
            : this(firstName, lastName)     // calls the first constructor
    {
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
        this.hobby = hobby
    }
}