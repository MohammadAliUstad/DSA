package leetCode

fun rotateArray(
    nums: IntArray, k: Int
) {

    val n = nums.size
    val rotation = k % n 

    fun reverse(start: Int, end: Int) {
        var left = start
        var right = end
        while (left < right) {
            val temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp
            left++
            right--
        }
    }

    reverse(0, n - 1)
    reverse(0, rotation - 1)
    reverse(rotation, n - 1)
}