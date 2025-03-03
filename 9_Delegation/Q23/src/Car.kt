package Q23

// Delegate drive method to driver instance.
class Car(private val driver: Drivable) : Drivable by driver
