fun sumOfElements(numbers: List<Int>?): Int {
    return numbers?.sum() ?: 0
}

fun main() {
    val exampleList: List<Int> = listOf(1,2,3,4,5,6,7,8,9,0)
    val nullList: List<Int>? = null

    println("Sum of elements from exampleList is ${sumOfElements(exampleList)}")
    println("Sum of elements from nullList is ${sumOfElements(nullList)}")
}