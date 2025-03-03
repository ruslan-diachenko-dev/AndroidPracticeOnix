import QNetwork.NetworkResponse
import QNetwork.handleNetworkResponse

fun main() {
    val response = mutableMapOf<String, NetworkResponse>()

    response["Success"] = NetworkResponse.Success("Data loaded!")
    response["Error"] = NetworkResponse.Error("Failed to load data.")
    response["Loading"] = NetworkResponse.Loading

    for(state in response) {
        handleNetworkResponse(state.value)
    }
}

