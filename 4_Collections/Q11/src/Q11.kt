fun getElementLengths(text: List<String>): List<Int>{
    return text.map { it.length }
}

fun main() {
    val exampleText = listOf("Hello", "World", "!")
    val lengths = getElementLengths(exampleText)

    println(lengths)
}