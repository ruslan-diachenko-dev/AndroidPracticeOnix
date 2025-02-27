import kotlin.math.sqrt

fun isPrime(number: Int) : Boolean {
    return when {
        number <= 1 -> false            // All numbers < 1 isn't prime.
        number == 2 -> true             // Only even is prime.
        number % 2 == 0 -> false        // If divide by 2, number isn't prime.
        else -> {                       // Last check odd numbers.
            val limit = sqrt(number.toDouble()).toInt()
            for (i in 3..limit step 2) {
                if (number % i == 0) return false
            }
            true
        }
    }
}

// Test
fun main(){
    val testNumbers = listOf(-5, 0, 1, 2, 3, 4, 5, 10, 13, 17, 19, 20, 23, 25, 29, 31, 37, 40, 41, 43, 47, 50)
    for (num in testNumbers) {
        println("$num is prime? ${isPrime(num).toString().uppercase()}")
    }
}