class Box<T>(private var item: T) {
    fun add(newItem: T) { item = newItem }
    fun retrieve(): T = item
}

fun main() {
    val intBox: Box<Int> = Box(10)
    val strBox: Box<String> = Box("String")

    println("intBox contains ${intBox.retrieve()}")
    println("strBox contains ${strBox.retrieve()}")
}