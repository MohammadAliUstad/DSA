package striversDSASheet.array.easy

// Solution: 01: Time Complexity: O(NlogN) & Space complexity: O(1)
fun missingNumber1(array: IntArray): Int {
    var sortedArray = array.sortedArray()
    for (i in array.indices) {
        if (sortedArray[i] != i) {
            return i
        }
    }
    return 0
}

// Solution 02: Time Complexity: O(N) & Space Complexity: O(1)
fun missingNumber2(nums: IntArray): Int {
    val n = nums.size
    var expectedSum = 0
    var actualSum = 0

    for (i in 0..n) {
        expectedSum += i
    }

    for (i in 0 until n) {
        actualSum += nums[i]
    }
    return expectedSum - actualSum
}


fun main() {
    print(missingNumber2(intArrayOf(3, 0, 1, 2, 5)))
}