package leetCode

fun removeDuplicates2(nums: IntArray): IntArray {
    if (nums.size <= 2) return nums

    var write = 2

    for (read in 2 until nums.size) {
        if (nums[read] != nums[write - 2]) {
            nums[write] = nums[read]
            write++
        }
    }

    return nums
}

fun main() {
    val array = intArrayOf(1, 2, 2, 2, 3, 3, 4, 4, 4)
    print(removeDuplicates2(array).contentToString())
}