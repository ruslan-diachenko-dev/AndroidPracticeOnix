fun sumOfInt(vararg numbers: Int): Int {
    return numbers.sum()
}

fun main() {
    val sum = sumOfInt(25, 33, 11, 222, 333, 0, -333, -222, -33, -25)

    println("Sum is $sum")
}