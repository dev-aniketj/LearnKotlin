package basic_fund

fun main() {

//    BOOLEAN , CHAR, STRING

    val flag: Boolean = false   // contains only (true, false)
    val ch: Char = '`'
    val firstName = "Aniket"
    val lastName = "Jain"

    println(flag)
    println("Reverse of flag : ${!flag}")
    println(ch)
    println("Full Name : $firstName $lastName")
    println("LastName first letter : ${lastName[0]}")
    println("LastName last letter : ${lastName[lastName.length - 1]}")
}