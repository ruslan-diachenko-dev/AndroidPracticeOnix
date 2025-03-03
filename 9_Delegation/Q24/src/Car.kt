package Q24
class Car {
    val largeData: List<String> by lazy {
        println("Init large data list.")
        listOf("Engine", "Windshield", "Rear window")
    }
}