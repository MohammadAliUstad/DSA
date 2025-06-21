package striversDSASheet.array.easy

// Solution: Time Complexity: O(N) & Space Complexity: O(1)
fun findLargestElement(array: IntArray): Int {
    var largest = array[0]

    for (i in 1 until array.size) {
        if (array[i] > largest) {
            largest = array[i]
        }
    }
    return largest
}

fun main() {
    val array = intArrayOf(3, 17, 5, 9, 12, 25, 1)
    print(findLargestElement(array))
}