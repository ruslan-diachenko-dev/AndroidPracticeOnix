abstract class Shape {
    abstract fun area(): Double
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
}

fun main() {
    val circle = Circle(10.0)
    val rectangle = Rectangle(10.0, 10.0)

    println("Circle Area is ${circle.area()}")
    println("Rectangle Area is ${rectangle.area()}")
}