fun <T> printList(list: List<T>): Unit {
    for (element in list) print("$element ")
    println()
}

fun main() {
    val names = listOf("Mike", "Neo", "Elizabet")
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    printList(names)
    printList(numbers)
}