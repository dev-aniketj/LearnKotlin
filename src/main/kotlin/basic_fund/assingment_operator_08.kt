package basic_fund

// Assignment Operator ( = )
// (+=, -=, *=, /=, %=)
fun main() {
    var a = 15
    var b = 2
    a += b
    println(a)  //17
    b = 5
    a -= b
    println(a)  //12

//    Increment operator
    a++                     //post-inc
    println(++a)    //14    //pre-inc

//    DECREMENT
    b = 10
    --b     //pre - 9
    println("decrement : ${b--}")    //post - 9
    println(b)      // 8
}