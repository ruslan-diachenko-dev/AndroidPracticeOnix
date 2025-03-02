fun getSortedOdds(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 != 0 }
                    .sortedByDescending { it }
}

fun main() {
    val numbers = listOf(1,2,3,7,8,9,4,5,6,0)
    val sortedOdds = getSortedOdds(numbers)

    println(sortedOdds)
}