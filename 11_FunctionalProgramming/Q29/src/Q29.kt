fun getWords(listOfSentences: List<String>): List<String> {
    return listOfSentences.flatMap { it.split(" ") }.map { it.replace(Regex("[^a-zA-Z0-9]"), "") }
}

fun main() {
    val listOfSentences = listOf(
        "Lorem ipsum odor amet, consectetuer adipiscing elit.",
        "Primis suscipit nullam ac;proin tempus aliquam.",
        "Dolor lacus placerat sodales neque semper class consequat hac.")

    val listOfWords = getWords(listOfSentences)
    println("All words: $listOfWords")
}
