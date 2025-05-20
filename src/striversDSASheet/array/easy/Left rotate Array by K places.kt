package striversDSASheet.array.easy

// Solution 01: Time Complexity: O(N^2) & Space Complexity: O(N)
fun leftRotateArray(arr: IntArray, k: Int): IntArray {
    val result = IntArray(arr.size)
    var tempArr = arr.copyOf()
    var rotations = 0

    while (rotations < k) {
        val firstElement = tempArr[0]

        for (i in 0 until arr.size - 1) {
            result[i] = tempArr[i + 1]
        }
        result[arr.size - 1] = firstElement
        tempArr = result.copyOf()
        rotations++
    }
    return result
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val k = 2

    val rotatedArr = leftRotateArray(arr, k)
    println(rotatedArr.joinToString(", "))
}