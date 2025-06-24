package striversDSASheet.array.easy

fun union(array1: IntArray, array2: IntArray): IntArray {
    val result = mutableListOf<Int>()
    var i = 0
    var j = 0

    while (i < array1.size && j < array2.size) {
        if (array1[i] < array2[j]) {
            result.add(array1[i])
            i++
        } else if (array1[i] > array2[j]) {
            result.add(array2[j])
            j++
        } else {
            result.add(array1[i])
            i++
            j++
        }
    }

    while (i < array1.size) {
        result.add(array1[i])
        i++
    }

    while (j < array2.size) {
        result.add(array2[j])
        j++
    }

    return result.toIntArray()
}

fun main() {
    var array1 = intArrayOf(2, 3, 6, 7, 8)
    var array2 = intArrayOf(1, 3, 4, 5, 7, 8, 9, 10)
    var array3 = union(array1, array2)
    println(array3.contentToString())
}