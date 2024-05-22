package lab_3

fun main() {
    println("Введите число:")
    val number = readln()
    val evenNumberCount = number.count { it.toString().toInt() % 2 == 0 }
    val oddNumberCount = number.count { it.toString().toInt() % 2 != 0 }
    println("Количество чётных цифр в числе: $evenNumberCount")
    println("Количество нечётных цифр в числе: $oddNumberCount")
}