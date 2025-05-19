package striversDSASheet.array.easy

fun removeDuplicates(arr: IntArray): Int {
    // Your logic will go here
    return -1 // Placeholder return
}

fun main() {
    val arr = intArrayOf(1, 1, 2, 2, 2, 3, 3)
    val k = removeDuplicates(arr)

    println("K = $k")
    println("Array after removing duplicates:")
    for (i in 0 until k) {
        print("${arr[i]} ")
    }
}