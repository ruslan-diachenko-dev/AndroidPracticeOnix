inline fun getExecutionTime(blockOfCode: () -> Unit): Double {
    val startTime = System.nanoTime()
    blockOfCode()
    val endTime = System.nanoTime()
    return (endTime - startTime) / 1_000_000_000.0
}

/* Long or Short function) */
fun someLongFunc() {
    var t = 0
    while (t < 5_000) t += (-1..1).random()
}

fun main() {
    val executionTime = getExecutionTime {
        someLongFunc()
    }

    println("Execution time someLongFunc() is $executionTime seconds.")
}