package lab_4

fun main() {
    val myList = mutableListOf<Int>()
    println("Введите элементы списка через запятую:")
    val input = readln().split(", ").map { it.toInt() }
    myList.addAll(input)
    val minNum = myList.min()
    val maxNum = myList.max()
    println("Минимальный элемент: $minNum. Максимальный элемент: $maxNum")
}