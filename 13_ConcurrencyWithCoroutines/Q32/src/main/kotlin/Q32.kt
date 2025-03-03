import kotlinx.coroutines.*

// Main fetch data function.
fun fetchData(): String {
    if((0..2).random() < 2) {
        throw Exception("Fetch failed!")
    }
    return "Fetch successfully!"
}

suspend fun fetchDataWithRetry(maxRetry: Int = 3, delayMillis: Long = 1000): String {
    var currentTry = 0

    while (currentTry < maxRetry) {
        try {
            return fetchData()
        } catch (e: Exception) {
            currentTry++
            println("[ERROR] Try[$currentTry] failed. Reason: ${e.message}")
            if (currentTry < maxRetry) {
                delay(delayMillis)
            }
        }
    }
    throw Exception("Failed to fetch data after $maxRetry tries.")
}

fun main() = runBlocking {
    try {
        val result = fetchDataWithRetry()
        println(result)
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
