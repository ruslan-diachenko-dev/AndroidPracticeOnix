infix fun Int.plus(integer: Int): Int {
    return this + integer
}

fun main() {
    println(99 plus -99 plus 1)
    println(-10 plus -2)
}