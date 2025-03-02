fun printString(text: String?) {
    if (text.isNullOrBlank()) {
        println("Empty")
    } else {
      println(text)
    }
}

fun main() {
    val exampleText = "Example Text"
    val blankText = ""

    printString(exampleText)
    printString(blankText)
    printString(null)
}