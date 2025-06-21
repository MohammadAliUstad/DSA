package striversDSASheet.array.easy

// Solution: Time Complexity: O(N) & Space Complexity: O(1)
fun findSecondSmallestandLargest(array: IntArray): String {
    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE
    var smallest = Int.MAX_VALUE
    var secondSmallest = Int.MAX_VALUE

    for (number in array) {
        if (number > largest) {
            secondLargest = largest
            largest = number
        } else if (number < largest && number > secondLargest) {
            secondLargest = number
        }

        if (number < smallest) {
            secondSmallest = smallest
            smallest = number
        } else if (number > smallest && number < secondSmallest) {
            secondSmallest = number
        }
    }
    return "Second Largest: $secondLargest, Second Smallest: $secondSmallest"
}

fun main() {
    var arr = intArrayOf(1, 5, -2, 2, 67, 8, 6, 8, -8, 9, 9, 10)
    var result = findSecondSmallestandLargest(arr)
    println(result)
}