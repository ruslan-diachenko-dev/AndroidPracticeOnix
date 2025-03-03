package QNetwork

sealed class NetworkResponse {
    data class Success(val data: String) : NetworkResponse()
    data class Error(val message: String) : NetworkResponse()
    data object Loading : NetworkResponse()
}

fun handleNetworkResponse(response: NetworkResponse) {
    when (response) {
        is NetworkResponse.Success -> {
            println("[Success] ${response.data}")
        }
        is NetworkResponse.Error -> {
            println("[Error] ${response.message}")
        }
        is NetworkResponse.Loading -> {
            println("Loading...")
        }
    }
}