package leetCode

fun removeDuplicates1(nums: IntArray): IntArray {
    if (nums.isEmpty()) return nums

    var write = 1

    for (read in 1 until nums.size) {
        if (nums[read] != nums[write - 1]) {
            nums[write] = nums[read]
            write++
        }
    }

    return nums
}

fun main() {
    val array = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    print(removeDuplicates1(array).contentToString())
}