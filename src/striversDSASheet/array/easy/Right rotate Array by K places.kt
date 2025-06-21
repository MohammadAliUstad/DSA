package striversDSASheet.array.easy

fun rightRotateArray1(arr: IntArray, k: Int): IntArray {
    for (i in 0 until k) {
        var lastElement = arr[arr.size - 1]
        for (i in arr.size - 1 downTo 1) {
            arr[i] = arr[i - 1]
        }
        arr[0] = lastElement
    }
    return arr
}

fun rightRotateArray2(arr: IntArray, k: Int): IntArray {
    val n = arr.size
    val rotation = k % n
    val reversedArr = arr.copyOf()
    reverse(reversedArr, 0, n - 1)
    reverse(reversedArr, 0, rotation - 1)
    reverse(reversedArr, rotation, n - 1)
    return reversedArr
}

fun reverse(arr: IntArray, start: Int, end: Int) {
    var left = start
    var right = end
    while (left < right) {
        val temp = arr[left]
        arr[left] = arr[right]
        arr[right] = temp
        left++
        right--
    }
}


fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 6)
    val k = 2
    val rotatedArr = rightRotateArray2(arr, k)

    println(rotatedArr.joinToString(", "))
}