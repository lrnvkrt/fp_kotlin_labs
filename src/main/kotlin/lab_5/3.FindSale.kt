package lab_5

fun main() {
    println("Введите первоначальную цену:")
    val initialPrice = readln().toDouble()
    println("Введите скидку:")
    val discount = readln().toDouble()
    val finalPrice = calculatePriceWithSale(initialPrice, discount)
    println("Цена со скидкой: $finalPrice")
}

fun calculatePriceWithSale(initialPrice: Double, discount: Double): String {
    val discountedPrice = initialPrice * (1 - discount / 100)
    return String.format("%.2f", discountedPrice).replace(",", ".")
}