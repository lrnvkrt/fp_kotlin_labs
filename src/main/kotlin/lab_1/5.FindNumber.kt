package lab_1

fun main() {
    print("Введите число: ")
    val num = readln()
    val result = num+(num.toInt()*2)
    println("Результат: $result")
}