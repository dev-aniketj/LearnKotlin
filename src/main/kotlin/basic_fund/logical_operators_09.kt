package basic_fund

// Logical Operators ( && , || , ! )
fun main() {
    var a = 5
    var b = 20

    if (b % a == 0 && b > a++)  // 6, 20
        println("statement 1st - $a $b")

//    if (a >= ++b || a % 2 == 0)   //6, 21
    if (a % 2 == 0 || a >= ++b)     //6, 20
        println("statement 2nd - $a $b")
}