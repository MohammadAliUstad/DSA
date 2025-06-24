package striversDSASheet.array.easy

fun removeDuplicates(arr: IntArray): Int {
    var uniqueIndex = 0

    for (currentIndex in 1 until arr.size) {
        if (arr[currentIndex] != arr[uniqueIndex]) {
            uniqueIndex++
            arr[uniqueIndex] = arr[currentIndex]
        }
    }

    return uniqueIndex + 1
}

fun main() {
    val arr = intArrayOf(1, 1, 2, 2, 2, 3, 3)
    val k = removeDuplicates(arr)

    println(k)
    println("Modified array: ${arr.copyOfRange(0, k).joinToString(", ")}")
}