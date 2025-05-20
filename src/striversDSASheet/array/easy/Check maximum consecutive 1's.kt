package striversDSASheet.array.easy

// Solution 01: Time Complexity: O(N) & Space Complexity: O(1)
fun maximum1s(array: IntArray): Int {
    var counter = 0
    var max = 0

    for (i in 0 until array.size) {
        if (array[i] == 1) {
            counter++
        } else {
            if (counter > max) {
                max = counter
            }
            counter = 0
        }
    }

    if (counter > max) {
        return counter
    }
    return max
}

fun main() {
    print(maximum1s(intArrayOf(1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1)))
}