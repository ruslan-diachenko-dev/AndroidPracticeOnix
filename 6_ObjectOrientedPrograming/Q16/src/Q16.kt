data class Book(val title: String, val author: String, val price: Double)

fun main() {
    val listOfBooks: List<Book> = listOf(
        Book("Sunset", "Mike", 9.99),
        Book("Moonrise", "Albert", 149.99),
        Book("Then", "Lilia", 19.99)
    )

    val filteredByPrice = listOfBooks.filter { it.price < 20 }
    println("List of books when price less than 20: $filteredByPrice")

}