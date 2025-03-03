package Q35

import kotlin.reflect.full.memberProperties

fun printPropertiesAndValues(obj: Any) {
    val kc = obj::class
    println("${kc.simpleName} have these properties and values:")

    kc.memberProperties.forEach { property ->
        val value = property.getter.call(obj)
        println("${property.name} = $value")
    }
}

fun main() {
    val exampleCar = Car(
        "Audi",
        2015,
        "Piter Black",
        120_000.0
    )

    printPropertiesAndValues(exampleCar)
}

