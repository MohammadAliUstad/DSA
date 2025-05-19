package striversDSASheet.array.easy

fun moveZerosToEnd(arr: IntArray): IntArray {
    // Your logic will go here
    return arr
}

fun main() {
    val arr = intArrayOf(1, 0, 2, 3, 0, 4, 0, 1)
    val result = moveZerosToEnd(arr)
    println("Output: ${result.joinToString(", ")}")
}
