import kotlinx.coroutines.*

suspend fun longTask() {
    repeat(100) { i ->
        println("[$i] Task is working...")
        delay(1000L)
    }
    println("Task successful completed!")
}

// Extension to cancel longTask.
suspend fun Job.cancelLongTask() {
    println("Cancelling the task...")
    job.cancelAndJoin()
    println("Task cancelled")
}
fun main() = runBlocking {
    val job = launch { longTask() }

    launch(Dispatchers.IO) {
        println("Press Enter to cancel job...")
        readln()
        job.cancelLongTask()
    }

    println("Program start!")
}