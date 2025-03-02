interface Drawable {
    fun draw() {
        println("Drew Nothing.")
    }
}

class Circle : Drawable {
    override fun draw() {
        println("The Circle was drawn.")
    }
}

class Square : Drawable {
    override fun draw() {
        println("The Square was drawn.")
    }
}

fun main() {
    val circle = Circle()
    val square = Square()

    circle.draw()
    square.draw()
}