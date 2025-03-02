fun String.isPalindrome(): Boolean {
    val text = this.lowercase()
    return text == text.reversed()
}

fun main() {
    println("Hello".isPalindrome())
    println("World!".isPalindrome())
    println("UaaU".isPalindrome())
    println("OuuO".isPalindrome())
}