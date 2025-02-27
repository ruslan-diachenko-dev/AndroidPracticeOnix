fun getNullableLength(str: String?): Int {
    return str?.length ?: -1
}

fun main() {
    val nullText = null
    val exampleText = "Example"

    println("nullText length is ${getNullableLength(nullText)}")
    println("exampleText length is ${getNullableLength(exampleText)}")
}