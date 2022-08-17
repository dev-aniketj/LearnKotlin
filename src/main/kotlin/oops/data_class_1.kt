package oops

// Data Classes

data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "Aniket")
    val user2 = User(2, "Ayush")
    val user3 = User(3, "Avi")

    println("User 2 name is : ${user2.name}")

    println("User 3 name is : ${user3.name}")
    // modify values
//    user3.id = 4 - shows an error because id is defined using val, and we can't change it value.
    user3.name = "Chinmay"
    println("User 3 name is : ${user3.name}")

    val user4 = user1.copy()
    println(user1 == user4)     // true - because its value is similar

    val (id, name) = user4  // unpackage data class member
    println("id=$id, name=$name")
}