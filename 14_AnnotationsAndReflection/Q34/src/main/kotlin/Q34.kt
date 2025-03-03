import kotlin.reflect.*
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class Serializable

data class Car(
    @Serializable val model: String,
    @Serializable val country: String,
    var owner: String,
    var price: Double
)

fun listSerializableProperties(kc: KClass<*>) {
    val properties = kc.memberProperties

    properties.filter { it.findAnnotation<Serializable>() != null }
                .forEach { println("Serializable property: ${it.name}") }

}

fun main() {
    listSerializableProperties(Car::class)
}