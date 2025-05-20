package myPractice

class NumberGroup {
    private val numbers: MutableSet<Int> = mutableSetOf() // Using a mutable set to store unique numbers

    // Method to myPractice.add a number to the group
    fun addNumber(number: Int) {
        if (numbers.add(number)) {
            println("$number added to the group.")
        } else {
            println("$number is already in the group.")
        }
    }

    // Method to remove a number from the group
    fun removeNumber(number: Int) {
        if (numbers.remove(number)) {
            println("$number removed from the group.")
        } else {
            println("$number is not in the group.")
        }
    }

    // Method to display all numbers in the group
    fun displayNumbers() {
        println("Current group of numbers: $numbers")
    }
}

fun main() {
    val numberGroup = NumberGroup()

    numberGroup.addNumber(5)
    numberGroup.addNumber(10)
    numberGroup.addNumber(5) // Attempt to myPractice.add a duplicate
    numberGroup.displayNumbers()

    numberGroup.removeNumber(10)
    numberGroup.removeNumber(20) // Attempt to remove a non-existent number
    numberGroup.displayNumbers()
}