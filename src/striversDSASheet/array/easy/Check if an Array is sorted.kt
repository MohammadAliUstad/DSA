package striversDSASheet.array.easy

// Time Complexity: O(N) & Space complexity: O(1)
fun isArraySorted(array: IntArray): Boolean {
    for (i in 0 until array.size - 1) {
        if (array[i] > array[i + 1]) {
            return false
        }
    }
    return true
}

fun main() {
    print(isArraySorted(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
}