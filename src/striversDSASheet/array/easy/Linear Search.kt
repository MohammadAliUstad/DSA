package striversDSASheet.array.easy

fun findIndex(arr: IntArray, num: Int): Int {
    for (i in 0 until arr.size) {
        if (arr[i] == num) {
            return i
        }
    }
    return 0
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val num = 3
    val index = findIndex(arr, num)
    println("Index of $num is: $index")
}