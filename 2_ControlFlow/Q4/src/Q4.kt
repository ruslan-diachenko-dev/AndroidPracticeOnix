fun factorial(number: Int): Int {
    return when {
        number < 0 -> -1                               // Error if number is negative.
        number == 0 -> 1                               // Factorial 0 is 1.
        else -> number * factorial(number - 1) // Recursive product.
    }
}

fun main() {
    println("Enter integer number: ")
    val num: Int = readln().toInt()
    println("Factorial $num is ${factorial(num)}")
}