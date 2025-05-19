package striversDSASheet.array.easy

// BruteForce Approach: Time complexity: O(N^2) & Space Complexity: O(1)
fun findIntersection1(arr1: IntArray, arr2: IntArray): List<Int> {
    val result = mutableListOf<Int>()

    for (i in 0 until arr1.size) {
        for (j in 0 until arr2.size) {
            if (arr1[i] == arr2[j]) {
                result.add(arr1[i])
            }
        }
    }
    return result
}

// Optimized Solution: Time complexity: O(N) & Space complexity: O(1)
fun findIntersection2(arr1: IntArray, arr2: IntArray): List<Int> {
    var i = 0
    var j = 0
    val result = mutableListOf<Int>()

    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] == arr2[j]) {
            result.add(arr1[i])
            i++
            j++
        } else if (arr1[i] < arr2[j]) {
            i++
        } else {
            j++
        }
    }

    return result
}

fun main() {
    val arr1 = intArrayOf(1, 2, 4, 5, 6)
    val arr2 = intArrayOf(2, 3, 5, 7)

    val intersection = findIntersection2(arr1, arr2)
    println(intersection)
}