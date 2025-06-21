package striversDSASheet.array.easy

// Solution: Time Complexity: O(N^2) & Space Complexity: O(N)
fun leftRotateArray(arr: IntArray, k: Int): IntArray {
    for (j in 0 until k) {
        var firstElement = arr[0]
        for (i in 0 until arr.size - 1) {
            arr[i] = arr[i + 1]
        }
        arr[arr.size - 1] = firstElement
    }

    return arr
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val k = 2

    val rotatedArr = leftRotateArray(arr, k)
    println(rotatedArr.joinToString(", "))
}