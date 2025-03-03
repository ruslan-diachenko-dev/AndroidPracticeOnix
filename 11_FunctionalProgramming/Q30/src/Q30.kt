fun <T> myFilter(list: List<T>, predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (item in list) {
        if (predicate(item)) result.add(item)
    }
    return result
}

fun main() {
    val sentences = listOf("Hello World!", "Hi, Mike!", "Hello Jim.")

    val sentenceHello = myFilter(sentences) {"Hello" in it}
    println("$sentenceHello")

    val sentenceDot = myFilter(sentences) {"." in it}
    println("$sentenceDot")
}