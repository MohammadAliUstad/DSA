//1
fun binarySearch(sortedArray: IntArray, target: Int): Int {
    // Initializing the left and right pointers for the search range
    var leftIndex = 0
    var rightIndex = sortedArray.size - 1

    // Continue searching while the left index is less than or equal to the right index
    while (leftIndex <= rightIndex) {
        // Calculate the mid-point index to check
        val midIndex = leftIndex + (rightIndex - leftIndex) / 2

        // Retrieve the value at the mid-point index
        val midValue = sortedArray[midIndex]

        // Compare the mid-value with the target
        if (midValue == target) {
            // Target found; return the index of the target
            return midIndex
        } else if (midValue < target) {
            // Target is in the right half; adjust the left index to search the right half
            leftIndex = midIndex + 1
        } else {
            // Target is in the left half; adjust the right index to search the left half
            rightIndex = midIndex - 1
        }
    }

    // If we reach here, the target is not found; return -1
    return -1
}

//2
fun bubbleSort(array: IntArray): IntArray {
    // Outer loop: Each pass through the array places the next largest element in its final position
    for (pass in 0 until array.size - 1) {
        // Inner loop: Go through each unsorted part of the array for the current pass
        for (index in 0 until array.size - pass - 1) {
            // Access the current and next elements to compare them
            val currentElement = array[index]
            val nextElement = array[index + 1]

            // If the current element is greater than the next, they are in the wrong order
            if (currentElement > nextElement) {
                // Swap the elements to put them in the correct order
                array[index] = nextElement
                array[index + 1] = currentElement
            }
        }
    }
    // Return the sorted array
    return array
}

//3
fun selectionSort(array: IntArray): IntArray {
    // Get the size of the array to control the loops
    val arraySize = array.size

    // Outer loop: Iterate over each element in the array, treating it as the current position
    for (currentIndex in 0 until arraySize - 1) {
        // Assume the minimum element is at the current index
        var minIndex = currentIndex

        // Inner loop: Find the smallest element in the unsorted portion of the array
        for (index in currentIndex + 1 until arraySize) {
            val currentMinElement = array[minIndex]
            val currentElement = array[index]

            // If the current element is smaller than the element at minIndex, update minIndex
            if (currentElement < currentMinElement) {
                minIndex = index
            }
        }

        // Swap the found minimum element with the element at currentIndex
        if (minIndex != currentIndex) {
            val temp = array[currentIndex]
            array[currentIndex] = array[minIndex]
            array[minIndex] = temp
        }
    }
    // Return the sorted array
    return array
}

//4
fun insertionSort(array: IntArray): IntArray {
    // Loop through each element starting from the second element (index 1)
    for (currentIndex in 1 until array.size) {
        // Store the current element in a variable; this is the element we want to insert in the correct position
        val currentElement = array[currentIndex]

        // Initialize a variable to track the position within the sorted portion of the array
        var position = currentIndex

        // Shift elements of the sorted portion that are greater than the current element one position to the right
        while (position > 0 && array[position - 1] > currentElement) {
            array[position] = array[position - 1]
            position--
        }

        // Insert the current element into its correct position
        array[position] = currentElement
    }
    // Return the sorted array
    return array
}

//5
fun quickSort(array: IntArray, low: Int, high: Int) {
    if (low < high) {
        val partitionIndex = partition(array, low, high)

        // Recursively sort the elements before and after the partition index
        quickSort(array, low, partitionIndex - 1)
        quickSort(array, partitionIndex + 1, high)
    }
}

fun partition(array: IntArray, low: Int, high: Int): Int {
    val pivotElement = array[high] // Select the last element as the pivot
    var smallerElementIndex = low - 1 // Index to place the smaller elements

    for (currentIndex in low until high) {
        if (array[currentIndex] <= pivotElement) {
            smallerElementIndex++
            swapElements(array, smallerElementIndex, currentIndex)
        }
    }

    // Place the pivot element in its correct sorted position
    swapElements(array, smallerElementIndex + 1, high)
    return smallerElementIndex + 1
}

fun swapElements(array: IntArray, firstIndex: Int, secondIndex: Int) {
    val temporaryValue = array[firstIndex]
    array[firstIndex] = array[secondIndex]
    array[secondIndex] = temporaryValue
}

fun main() {

}