package striversDSASheet.array.easy

// Solution 01: Time Complexity: O(N^2) & Space Complexity: O(1)
fun searchMatrixBrute(matrix: Array<IntArray>, target: Int): Boolean {
    for (row in matrix) {
        for (col in row) {
            if (col == target) return true
        }
    }
    return false
}

// Solution 02: Time Complexity: O(N) & Space Complexity: O(N)
fun searchMatrixTopRight(matrix: Array<IntArray>, target: Int): Boolean {
    var row = 0
    var col = matrix[0].size - 1

    while (row < matrix.size && col >= 0) {
        when {
            matrix[row][col] == target -> return true
            matrix[row][col] > target -> col--
            else -> row++
        }
    }
    return false
}

// Solution 03: Time Complexity: O(N) & Space Complexity: O(1)
fun searchMatrixRowBinary(matrix: Array<IntArray>, target: Int): Boolean {
    for (row in matrix) {
        var start = 0
        var end = matrix.size - 1

        while (start <= end) {
            val mid = start + (end - start) / 2
            when {
                row[mid] == target -> return true
                row[mid] > target -> start = mid + 1
                else -> end = mid - 1
            }
        }
    }

    return false
}

// Solution 04: Time Complexity: O(N) & Space Complexity: O(1)
fun searchMatrixOptimal(matrix: Array<IntArray>, target: Int): Boolean {
    val rows = matrix.size
    val cols = matrix[0].size
    var start = 0
    var end = rows * cols - 1

    while (start <= end) {
        val mid = start + (end - start) / 2
        val midElement = matrix[mid / cols][mid % cols]

        when {
            midElement == target -> return true
            midElement < target -> start = mid + 1
            else -> end = mid + 1
        }
    }
    return false
}


fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 3, 5, 7),
        intArrayOf(10, 11, 16, 20),
        intArrayOf(23, 30, 34, 60)
    )

    var target = searchMatrixTopRight(matrix, 3)

    println(target)
}