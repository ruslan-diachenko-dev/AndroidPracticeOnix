import kotlinx.coroutines.*

// API mock
suspend fun fetchGet(): String {
    delay(2500)
    return "Get"
}

suspend fun fetchPost(): String {
    delay(1000)
    return "Post"
}

// For parallel using async, await - wait all fetches.
suspend fun fetchCombine(): String = coroutineScope {
    val getDeferred = async { fetchGet() }
    val postDeferred = async { fetchPost() }

    val (get, post) = awaitAll(getDeferred, postDeferred)
    return@coroutineScope "Combine fetch result: $get - $post"
}

fun main() = runBlocking {
    val result = fetchCombine()
    println(result)
}
