package lab_3

fun main() {
    var sum = 0
    var currentNum = 5
    while (currentNum++ <= 57) { if (currentNum !in listOf(34, 46, 52)) sum += currentNum }
    println("Сумма чисел в диапазоне от 5 до 57 равна $sum.")
}