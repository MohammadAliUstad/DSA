import kotlin.math.sqrt
import kotlin.random.Random

//1
fun fizzBuzz(n: Int) {
    if (n % 3 == 0 && n % 5 == 0) {
        println("FizzBuzz")
    } else if (n % 5 == 0) {
        println("Fizz")
    } else if (n % 3 == 0) {
        println("Buzz")
    } else {
        println("No Fizz or Buzz")
    }
}

//2
fun stringReverse(s: String) {
    for (i in s.length - 1 downTo 0) {
        print(s[i])
    }
    println()
}

//3
fun palindrome(s: String) {
    var r = ""
    for (i in s.length - 1 downTo 0) {
        r += s[i]
    }
    if (r.lowercase() == s.lowercase()) {
        println("The String is a Palindrome")
    } else {
        println("The String is not a Palindrome")
    }
}

//4
fun factorial(n: Int) {
    var g = 1
    for (i in n downTo 1) {
        g *= i
    }
    println("Factorial of $n is $g")
}

//5
fun fibonacci(n: Int) {
    var first = 0
    var second = 1
    var third: Int
    if (n == 0) {
        println(0)
    }
    if (n == 1) {
        println(1)
    }
    if (n >= 2) {
        print("0,")
        print("1,")
        for (i in n downTo 2) {
            third = first + second
            first = second
            second = third
            if (i == 2) {
                print("$third")
            } else {
                print("${third},")
            }
        }
    }
}

//6
fun add(a: Int, b: Int) {
    println(a + b)
}

//7
fun max(a: IntArray) {
    var max = a[0]
    for (i in a) {
        if (i > max) {
            max = i
        }
    }
    println(max)
}

//8
fun vowelCounter(s: String) {
    var count = 0
    for (i in s) {
        if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
            count++
        }
    }
    println(count)
}

//9
fun primeChecker(n: Int) {
    var isPrime = true

    if (n < 2) {
        isPrime = false
    } else {
        for (i in 2..sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                isPrime = false
                break
            }
        }
    }

    if (isPrime) {
        println("The number is Prime")
    } else {
        println("The number is not Prime")
    }
}

//10
fun merge(a1: IntArray, a2: IntArray): IntArray {
    var i = 0
    var j = 0
    var k = 0
    var a3 = IntArray(a1.size + a2.size) { 0 }
    while (i < a1.size && j < a2.size) {
        if (a1[i] < a2[j]) {
            a3[k] = a1[i]
            i++
        } else {
            a3[k] = a2[j]
            j++
        }
        k++
    }
    while (i < a1.size) {
        a3[k] = a1[i]
        i++
        k++
    }
    while (j < a2.size) {
        a3[k] = a2[j]
        j++
        k++
    }
    return a3
}

//11
fun letterCounter(s: String) {
    var maxChar = s[0]
    if (s.isNotEmpty()) {
        for (a in s) {
            if (a.lowercaseChar().code > maxChar.lowercaseChar().code) {
                maxChar = a
            }
        }
    }
    var hashmap = Array(maxChar.code + 1) { 0 }
    for (a in s) {
        if (a.isLetter()) {
            hashmap[a.lowercaseChar().code] += 1
        }
    }
    for (i in hashmap.indices) {
        if (hashmap[i] > 0) {
            println("The letter ${i.toChar()} is repeated ${hashmap[i]} times!")
        }
    }
}

//12
fun characterCounter(s: String) {
    val charCount = mutableMapOf<Char, Int>()
    for (char in s) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }
    for ((char, count) in charCount) {
        println("The character '$char' is repeated $count times!")
    }
}

//13
fun duplicateRemover(a: IntArray): IntArray {
    var n: IntArray
    val integers = mutableMapOf<Int, Int>()
    for (i in a) {
        integers[i] = integers.getOrDefault(i, 0) + 1
    }
    val uniqueList = mutableListOf<Int>()
    for ((int) in integers) {
        uniqueList.add(int)
    }
    n = uniqueList.toIntArray()
    return n
}

//14
fun integerSum(n: Int) {
    var m = n
    var p = 0
    while (m > 0) {
        p += m % 10
        m /= 10
    }
    println(p)
}

//15
fun secondLargest(a: IntArray) {
    var largest = 0
    var secondLargest = 0
    for (i in a) {
        if (i > largest) {
            secondLargest = largest
            largest = i
        }
        if (i > secondLargest && i < largest) {
            secondLargest = i
        }
    }
    println("$secondLargest is the Second Largest number!")
}

//16
fun anagramCheck1(s: String, t: String) {
    var n = ""
    var m = ""
    val string1 = mutableMapOf<Char, Int>()
    val string2 = mutableMapOf<Char, Int>()
    for (a in s.lowercase()) {
        string1[a] = string1.getOrDefault(a, 0) + 1
    }
    for (a in t.lowercase()) {
        string2[a] = string2.getOrDefault(a, 0) + 1
    }
    for ((char, count) in string1) {
        for (i in count downTo 0) {
            n += char
        }
    }
    for ((char, count) in string2) {
        for (i in count downTo 0) {
            m += char
        }
    }
    if (n.length == m.length) {
        println("The string is an Anagram!")
    } else {
        println("The string is not an Anagram!")
    }
}

//17
fun anagramCheck2(s: String, t: String) {
    var str1 = s.lowercase()
    var str2 = t.lowercase()
    if (str1.length == str2.length) {
        if (str1.toCharArray().sorted() == str2.toCharArray().sorted()) {
            println("The string is an Anagram!")
        } else {
            println("The string is not an Anagram!")
        }
    } else {
        println("The string is not an Anagram!")
    }
}

//18
fun longestWord(sentence: String) {
    var currentWord = ""
    var largestWord = ""
    for (a in sentence) {
        if (a.isLetter()) {
            currentWord += a
        } else {
            if (currentWord.length > largestWord.length) {
                largestWord = currentWord
            }
            currentWord = ""
        }
    }
    println(largestWord)
}

//19
fun power(n: Int, m: Int): Int {
    var r = 1
    if (m == 0) {
        return 1
    } else {
        for (i in 1..m) {
            r *= n
        }
        return r
    }
}

//20
fun isArmstrong(n: Int) {
    var p = n
    var count = 0
    while (p > 0) {
        p /= 10
        count++
    }
    var m: Int
    var r = 0
    p = n
    while (r < n) {
        m = p % 10
        r += power(m, count)
        p /= 10
    }
    if (r == n) {
        println("It is an Armstrong!")
    } else {
        println("It is not an Armstrong!")
    }
}

//21
fun arrayRotate(a: IntArray, n: Int, s: String): IntArray {
    var y = IntArray(a.size) { 0 }
    var x = IntArray(a.size) { 0 }
    for (i in a.indices) {
        x[i] = a[i]
    }
    when (s.lowercase()) {
        "right" -> {
            for (i in 1..n) {
                var z = x[x.size - 1]
                for (e in 0..x.size - 2) {
                    y[e + 1] = x[e]
                }
                y[0] = z
                for (j in y.indices) {
                    x[j] = y[j]
                }
            }
        }

        "left" -> {
            for (i in 1..n) {
                var z = x[0]
                for (e in x.size - 2 downTo 0) {
                    y[e] = x[e + 1]
                }
                y[a.size - 1] = z
                for (j in y.indices) {
                    x[j] = y[j]
                }
            }
        }
    }
    return y
}

//22
fun decimal2Binary(n: Int) {
    var decimal = n
    var remainders = mutableListOf<Int>()
    while (decimal > 0) {
        remainders.add(decimal % 2)
        decimal /= 2
    }
    for (binary in remainders.reversed()) {
        print(binary)
    }
    println()
}

//23
fun binary2Decimal(n: Int) {
    var decimal = 0
    var power = 0
    var binary = n.toString().map { it.toString().toInt() }.toIntArray()
    for (e in binary.reversed()) {
        decimal += e * power(2, power++)
    }
    println(decimal)
}

//24
fun min(a: IntArray): Int {
    var min = a[0]
    for (i in a) {
        if (i < min) {
            min = i
        }
    }
    return min
}

//25
fun wordCounter(s: String): Int {
    var count = 1
    for (a in s) {
        if (a == ' ') {
            count++
        }
    }
    return count
}

//26
fun smallestCommonMultiple(n: Int, m: Int): Int {
    for (i in 2..10) {
        if (n % i == 0 && m % i == 0) {
            return i
        }
    }
    return 1
}

//27
fun largestCommonMultiple(n: Int, m: Int): Int {
    for (i in 10 downTo 2) {
        if (n % i == 0 && m % i == 0) {
            return i
        }
    }
    return 1
}

//28
fun isLeapYear(n: Int) {
    if (n % 4 == 0) {
        if (n % 400 == 0) {
            println("It is a Leap year!")
        } else if (n % 100 == 0) {
            println("It is not Leap year!")
        } else {
            println("It is a Leap year!")
        }
    }
}

//29
fun nPrimeNumbers(n: Int): IntArray {
    val primeNumbers = mutableListOf<Int>()
    var number = 2

    while (primeNumbers.size < n) {
        var isPrime = true
        for (i in 2..sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            primeNumbers.add(number)
        }
        number++
    }
    return primeNumbers.toIntArray()
}

//30
fun sieveOfEratosthenes(n: Int): List<Int> {
    val primes = BooleanArray(n + 1) { true }
    primes[0] = false
    primes[1] = false
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (primes[i]) {
            for (j in i * i..n step i) {
                primes[j] = false
            }
        }
    }
    return primes.mapIndexed { index, isPrime ->
        if (isPrime) {
            index
        } else {
            null
        }
    }.filterNotNull()
}

//31
fun stringCompressor(s: String): String {
    var compressed = StringBuilder()
    var count = 1
    for (i in 1..<s.length) {
        if (s[i] == s[i - 1]) {
            count++
        } else {
            compressed.append(s[i - 1]).append(count)
            count = 1
        }
    }
    compressed.append(s[s.length - 1]).append(count)
    return compressed.toString()
}

//32
fun sumOddEven(a: IntArray): String {
    var odd = 0
    var even = 0
    for (e in a) {
        if (e % 2 != 0) {
            odd += e
        } else {
            even += e
        }
    }
    return "Sum of Odds = $odd, Sum of Evens = $even"
}

//33
fun digitCounter(n: Int): Int {
    var m = n
    var p = 0
    while (m > 0) {
        m /= 10
        p++
    }
    return p
}

//34
fun largestOdd(a: IntArray): Int {
    var n = 0
    for (e in a) {
        if (e > n && e % 2 != 0) {
            n = e
        }
    }
    return n
}

//35
fun numberFrequency(array: IntArray): Map<Int, Int> {
    val frequency = mutableMapOf<Int, Int>()
    for (element in array) {
        frequency[element] = frequency.getOrDefault(element, 0) + 1
    }
    return frequency
}

//36
fun randomGenerator(start: Int, end: Int): Int {
    return Random.nextInt(start, end + 1)
}

//37
fun missingNumber(a: IntArray): Int {
    var first = 0
    var second = 0
    for (e in a) {
        first = e
        if (first - second > 1) {
            return first - 1
        }
        second = first
    }
    return first - 1
}

//38
fun intersection(a: IntArray, b: IntArray): IntArray {
    var c = mutableListOf<Int>()
    for (e in a) {
        for (i in b) {
            if (e == i) {
                c.add(i)
            }
        }
    }
    return c.toIntArray()
}

//39
fun unionOfArrays(a: IntArray, b: IntArray): IntArray {
    val c = mutableListOf<Int>()
    for (e in a) {
        c.add(e)
    }
    for (e in b) {
        var d = false
        for (i in c) {
            if (e == i) {
                d = true
                break
            }
        }
        if (!d) {
            c.add(e)
        }
    }
    return c.toIntArray()
}

//40
fun parenthesesBalance(s: String): Boolean {
    var count = 0
    for (e in s) {
        if (e == '(') {
            count++
        } else if (e == ')') {
            count--
        }
    }
    if (count == 0) {
        return true
    } else {
        return false
    }
}

//41 Recursive 1
fun getPermutations1(str: String): List<String> {
    val result = mutableListOf<String>()
    permute(str.toCharArray(), 0, result)
    return result
}

private fun permute(chars: CharArray, startIndex: Int, result: MutableList<String>) {
    if (startIndex == chars.size - 1) {
        result.add(String(chars))
        return
    }

    for (i in startIndex..<chars.size) {
        chars.swap(startIndex, i)
        permute(chars, startIndex + 1, result)
        chars.swap(startIndex, i)
    }
}

private fun CharArray.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}

//42 Recursive 2
fun getPermutations2(str: String): List<String> {
    val permutations = mutableListOf<String>()
    if (str.isEmpty()) return listOf("") // Base case: empty string

    val firstChar = str[0]
    val remaining = str.substring(1)
    val subPermutations = getPermutations2(remaining)

    for (perm in subPermutations) {
        for (i in 0..perm.length) {
            val newPermutation = perm.substring(0, i) + firstChar + perm.substring(i)
            permutations.add(newPermutation)
        }
    }
    return permutations
}

//43 Iterative
fun getPermutations3(str: String): List<String> {
    if (str.isEmpty()) return listOf("") // Edge case for empty string

    val permutations = mutableListOf<String>()
    permutations.add(str[0].toString()) // Start with the first character

    for (i in 1..<str.length) {
        val currentChar = str[i]
        val newPermutations = mutableListOf<String>()

        for (perm in permutations) {
            for (j in 0..perm.length) {
                // Insert currentChar at every position in perm
                val newPermutation = perm.substring(0, j) + currentChar + perm.substring(j)
                newPermutations.add(newPermutation)
            }
        }
        permutations.clear()
        permutations.addAll(newPermutations) // Update with new permutations
    }
    return permutations
}

//43
fun getSubsets(set: Set<Int>): List<List<Int>> {
    val subsets = mutableListOf<List<Int>>()
    subsets.add(emptyList()) // Start with the empty subset

    for (element in set) {
        val newSubsets = mutableListOf<List<Int>>()
        for (subset in subsets) {
            // Create a new subset by adding the current element to each existing subset
            val newSubset = subset + element
            newSubsets.add(newSubset)
        }
        subsets.addAll(newSubsets) // Add the newly created subsets to the main list
    }

    return subsets
}

//44
fun isRotation(string1: String, string2: String): Boolean {
    var char1 = string1.toCharArray()
    var char2 = string2.toCharArray()
    var charArray = CharArray(char1.size)

    for (i in 1..string1.length) {
        var z = char1[char1.size - 1]
        for (e in 0..char1.size - 2) {
            charArray[e + 1] = char1[e]
        }
        charArray[0] = z
        for (j in char1.indices) {
            char1[j] = charArray[j]
        }
        if (char1.contentEquals(char2)) {
            return true
        }
    }
    return false
}

//45
fun calculator() {
    println("Greetings!")
    println("Enter two numbers")
    var number1 = readln().toInt()
    var number2 = readln().toInt()
    println("Enter the desired operation")
    var operation = readln()
    when (operation) {
        "+" -> {
            println("Result: ${number1 + number2}")
        }

        "-" -> {
            println("Result: ${number1 - number2}")
        }

        "*" -> {
            println("Result: ${number1 * number2}")
        }

        "/" -> {
            println("Result: ${number1 / number2}")
        }

        "%" -> {
            println("Result: ${number1 % number2}")
        }
    }
}

//46
fun primes(n: Int): IntArray {
    val primeNumbers = mutableListOf<Int>()
    var number = 2

    while (number < n) {
        var isPrime = true
        for (i in 2..sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            primeNumbers.add(number)
        }
        number++
    }
    return primeNumbers.toIntArray()
}

fun main() {

}