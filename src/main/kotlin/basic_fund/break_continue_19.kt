package basic_fund

fun main() {
//    break (exit)
    var i = 1
    while (true) {
        print("$i   ")
        i++
        if (i / 2 == 5) break
    }

    println()
//    continue (jump)
    i = 0
    while (i < 10) {
        if (++i % 2 == 0) continue
        print("$i   ")
    }

    println()
    for (j in 1..20) {
        if (j / 2 == 5 || j > 15) continue
        print("$j  ")
    }


    println()
//    break and continue
    for (k in 1..10) {
        if (k == 2 || k == 4) continue
        if (k == 7) break
        print("$k  ")
    }
}