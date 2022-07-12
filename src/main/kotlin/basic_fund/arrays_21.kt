package basic_fund

fun main() {
    val nums = arrayOf(1, 3, 5, 2, 4)
    println(nums)       //it print the base address of the array not the elements.


//    access the particular element in an array
    println(nums[0])    //1
    println(nums[2])    //5


//    printing the whole array
    println("--------------------------------------------------")
    printArray(nums)


    println()
//    change array element
    nums[0] = 10
    nums[1] = 20
    printArray(nums)

    println()
//    size/length on an array
    print(nums.size)


//    checking element is exists in an Array or Not
    for (i in nums) {
        if (i == 20) println("\nElement is present at ${nums.indexOf(i)} index.")
    }

}

fun printArray(nums: Array<Int>) {
    print("Array : [")
    for (i in nums) {
        print("$i, ")
    }
    print("\b\b]")
}