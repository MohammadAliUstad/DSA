package leetCode

fun removeElement(
    array: IntArray,
    element: Int
): Int {

    var write = 0

    for (read in array.indices) {
        if (array[read] != element) {
            array[write] = array[read]
            write++
        }
    }

    return write
}

fun main() {
    val array = intArrayOf(2, 2, 2, 2, 2, 3, 3, 3, 2, 2, 2, 3)
    print(removeElement(array, 3))
}