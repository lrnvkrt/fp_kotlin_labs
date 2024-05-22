package lab_4

fun main() {
    val myList = mutableListOf<Int>()
    myList.addAll(listOf(8, 21, 5, 90, 11, 0))
    println("После заполнения элементами лист выглядит так: $myList")
    myList.add(0, 90)
    println("После добавления числа 90 по индексу 0 лист выглядит так: $myList")
    myList.removeAt(4)
    println("После удаления элемента по индексу 4 лист выглядит так: $myList")
    myList.add(-35)
    println("Конечный лист выглядит следующим образом: $myList")
}