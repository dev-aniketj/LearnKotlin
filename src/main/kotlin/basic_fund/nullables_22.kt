package basic_fund

fun main() {
    var name: String = "Aniket"
//    name = null -> Compilation Error

    var text: String? = "My name is Aniket"
    text = null

    print(text)

//    Use of nullable
    var len = name.length
    var len2 = text?.length

    /**
     * @param len2
     * below logic the explanation of len2
     */
    var len3 = if (text != null) {
        text.length
    } else {
        null
    }


//    println(text?.lowercase()) -> Compilation Error

}