fun applyDiscount(price: Double, discount: (Double) -> Double): Double {
    return discount(price)
}

fun main() {
    val discount5 = {price: Double -> price * 0.95} // Lambda 5% discount.
    val discount10 = {price: Double -> price * 0.9} // Lambda 10% discount.

    val currentPrice = 120.0
    println("Price then $currentPrice, Price now (5%) ${applyDiscount(currentPrice, discount5)}")
    println("Price then $currentPrice, Price now (10%) ${applyDiscount(currentPrice, discount10)}")
}