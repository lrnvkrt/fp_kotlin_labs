package lab_3

fun main() {
    val sum = (1..100).filter { it % 4 == 0 }.sum()
    println("Сумма чисел, кратных 4, в диапазоне от 1 до 100 равна $sum")
}