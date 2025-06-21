package striversDSASheet.array.easy

fun rowWithMax1s(matrix: Array<IntArray>): String {
    var counter = 0
    var index = 0
    var reset = 0
    for (i in 0..matrix.size-1) {
        for (j in 0..matrix[i].size-1) {
            if (matrix[i][j] == 1) {
                counter++
            }
        }
        if (counter > reset) {
            index = i
            reset = counter
        }
        counter = 0
    }
    return "$reset, $index"
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(0, 1, 1, 1),
        intArrayOf(0, 0, 1, 1),
        intArrayOf(1, 1, 1, 1),
        intArrayOf(0, 0, 0, 0)
    )
    val result = rowWithMax1s(matrix)
    println("Row with maximum 1s: $result")
}