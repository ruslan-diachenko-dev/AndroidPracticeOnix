fun fibonacci(n: Int): String {
    var currentNumber = 0
    var previousNumber = 1
    var sequence = ""

    for (i in 1..n) {
        sequence = "$sequence$currentNumber "
        val temp = currentNumber + previousNumber
        currentNumber = previousNumber
        previousNumber = temp

    }
    return sequence
}
fun main() {
    println(fibonacci(10))
}