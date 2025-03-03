import kotlinx.coroutines.*

suspend fun firstTask() {
    delay(1000)
    println("First Task completed.")
}

suspend fun secondTask() {
    delay(1500)
    println("Second Task completed.")
}

suspend fun thirdTask() {
    delay(2000)
    println("Third Task completed.")
}

fun main() = runBlocking {
    launch {
        firstTask()
    }
    launch {
        secondTask()
    }
    launch {
        thirdTask()
    }
    println("Tasks launched...")
}