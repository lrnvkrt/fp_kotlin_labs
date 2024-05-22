package lab_2

fun main() {
    print("Введите первое число: ")
    val firstNum = readln().toInt()
    print("Введите второе число: ")
    val secondNum = readln().toInt()
    if (firstNum%2 == 0 && secondNum%2 == 0) println(true) else println(false)
}