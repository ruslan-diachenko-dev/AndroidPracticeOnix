import kotlinx.coroutines.*

// Three simulation tasks.
suspend fun firstTask(): String {
    println("First Task Processing...")
    delay(1000L)
    return "First Task Completed."
}
suspend fun secondTask(): String {
    println("Second Task Processing...")
    delay(2000L)
    return "Second Task Completed."
}
suspend fun thirdTask(): String {
    println("Third Task Processing...")
    delay(3000L)
    return "Third Task Completed."
}

// Run multiply tasks and get their results.
suspend fun runMultiplyCoroutines(): List<String> = coroutineScope {
    val deferredFirst = async { firstTask() }
    val deferredSecond = async { secondTask() }
    val deferredThird = async { thirdTask() }

    listOf(deferredFirst, deferredSecond, deferredThird).map { it.await() }
}

fun main() = runBlocking {
    val results = runMultiplyCoroutines()

    results.forEach { println(it) }
}