class Person(val name: String, var age: Short)  // Class Person with properties name and age.

fun main() {
    val p1 = Person("Ruslan", 19)

    println("My name is ${p1.name}. I am ${p1.age} years old.")
}