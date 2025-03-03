fun main() {
    val numbers = listOf(3, 3, 3, 3)
    println(numbers.fold(1) {acc, number -> acc * number})

}