package oops

// Scope and Shadowing

// Global Scope
var name  = "Aniket"
fun main() {
    myFunction(5)
    println(name)
    name = "Ayush"
    println(name)
}

// Shadowing
fun myFunction(a: Int) {
    var a = 4
    println("a = $a")
}