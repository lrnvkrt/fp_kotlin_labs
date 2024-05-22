package lab_4

fun main() {
    println("Введите элементы списка через запятую:")
    val myList = readln().split(", ").map { it.toInt() }.toMutableList()
    if (myList.size < 2) println("Вероятно, в листе, состоящем из одного элемента, почти наименьшего числа не будет...")
    else {
        val almostSmallest = myList.sorted().find { it > myList.min() }
        if (almostSmallest == null) println("Кажется, все числа листа являются наименьшими, так как они одинаковые!")
        else println("Вашему вниманию представляется почти наименьшее число листа: $almostSmallest.")
    }
}