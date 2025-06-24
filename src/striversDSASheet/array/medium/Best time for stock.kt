package striversDSASheet.array.medium

fun bestTimeToBuy(prices: IntArray): Int {
    var min = Int.MAX_VALUE
    var currentPrice: Int
    var maxProfit = Int.MIN_VALUE

    for (amount in prices) {
        if (min > amount) {
            min = amount
        }

        currentPrice = amount - min
        if (currentPrice > maxProfit) {
            maxProfit = currentPrice
        }

    }
    return maxProfit
}

fun main() {
    var prices = intArrayOf(7, 1, 4, 5, 6, 8)
    println(bestTimeToBuy(prices))
}