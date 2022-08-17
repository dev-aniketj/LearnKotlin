package oops

import kotlin.math.floor

class TypeCasting {
    val stringList: List<String> = listOf(
        "Aniket", "Ayush", "Chinmay", "Avi", "Chirag"
    )
    val mixedList: List<Any> = listOf(
        "abc", 30.25, 15_000_000_437_29L, "xyz", 82.125954
    )

    fun displayList(list: List<Any>) {
        print("[")
        for (i in list) {
            if (i is Double) {
                print("${floor(i).toInt()}, ")  //type casting
            } else {
                print("$i, ")
            }
        }
        println("\b\b]")
    }
}

fun main() {
    val a = TypeCasting()
    a.displayList(a.stringList)
    a.displayList(a.mixedList)

    val str1: Any = "My name is aniket"
    val str2: String? = str1 as? String     // using as? when we are not sure about it is String type or Not
    println(str2)
}