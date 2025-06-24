package striversDSASheet.array.easy

// Solution: Time Complexity: O(N) & Space Complexity: O(1)
fun moveZerosToEnd2(arr: IntArray): IntArray {
    var insertPos = 0

    for (i in 0 until arr.size) {
        if (arr[i] != 0) {
            arr[insertPos] = arr[i]
            insertPos++
        }
    }

    while (insertPos < arr.size) {
        arr[insertPos] = 0
        insertPos++
    }

    return arr
}

fun main() {
    val arr = intArrayOf(1, 0, 2, 3, 0, 4, 0, 1)
    val result = moveZerosToEnd2(arr)
    println("Output: ${result.joinToString(", ")}")
}