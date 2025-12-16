package leetCode

fun mergeTwoSortedArrays(
    nums1: IntArray,
    m: Int,
    nums2: IntArray,
    n: Int
): IntArray {

    var i = m - 1
    var j = n - 1
    var k = m + n - 1

    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i]
            i--
        } else {
            nums1[k] = nums2[j]
            j--
        }
        k--
    }

    while (j >= 0) {
        nums1[k] = nums2[j]
        j--
        k--
    }

    return nums1
}

fun main() {
    val result = mergeTwoSortedArrays(
        nums1 = intArrayOf(1, 2, 3, 0, 0, 0),
        m = 3,
        nums2 = intArrayOf(2, 5, 6),
        n = 3
    )

    println(result.contentToString())
}