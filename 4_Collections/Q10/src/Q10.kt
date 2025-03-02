fun findMinMax(numbers: List<Int>): Pair<Int?, Int?> {
    val max = numbers.maxOrNull()  // Min value from list.
    val min = numbers.minOrNull()  // Max value from list.
    return Pair(min, max) // Returns a pair.
}

fun main() {
    val numbers = listOf(9, 10, 101, 500, 344, 89, -5)
    val (min, max) = findMinMax(numbers)

    println("Min: $min, Max: $max")
}