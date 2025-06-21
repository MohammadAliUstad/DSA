package striversDSASheet.array.easy

// Solution 01: Time Complexity: O(N) & Space Complexity: O(1)
fun subArraySum1(arr: IntArray, targetSum: Int): Int {
    var start = 0
    var end = 0
    var currentSum = 0
    var maxLength = 0

    while (end < arr.size) {
        currentSum += arr[end]

        while (currentSum > targetSum && start <= end) {
            currentSum -= arr[start]
            start++
        }

        if (currentSum == targetSum) {
            maxLength = maxOf(maxLength, end - start + 1)
        }

        end++
    }

    return maxLength
}

// Solution 02: Time Complexity: O(N^2) & Space Complexity: O(1)
fun subArraySum2(arr: IntArray, targetSum: Int): Int {
    var maxLength = 0

    for (start in arr.indices) {
        var currentSum = 0
        for (end in start until arr.size) {
            currentSum += arr[end]
            if (currentSum == targetSum) {
                maxLength = maxOf(maxLength, end - start + 1)
            }
        }
    }
    return maxLength
}

fun main() {
    val array = intArrayOf(1, 2, 3, 7, 5)
    val target = 12
    println("Length of subarray $target: ${subArraySum1(array, target)}")
}