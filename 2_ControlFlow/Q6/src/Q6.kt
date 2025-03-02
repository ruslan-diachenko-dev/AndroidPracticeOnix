fun checkEvenOrOdd(number: Int): String {
    return when {
        number % 2 == 0 -> "Even"
        else -> "Odd"
    }
}
fun main() {
    val num = (0..100).random()

    println("$num is ${checkEvenOrOdd(num)}")
}