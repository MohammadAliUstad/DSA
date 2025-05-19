package striversDSASheet.array.easy

fun findIndex(arr: IntArray, num: Int): Int {
    // Your logic will go here
    return -1 // Default return if number is not found
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val num = 3
    val index = findIndex(arr, num)
    println("Index of $num is: $index")
}
