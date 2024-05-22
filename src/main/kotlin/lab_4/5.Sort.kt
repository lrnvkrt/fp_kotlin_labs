package lab_4

fun main() {
    println("Введите элементы списка через запятую:")
    val myList = readln().split(", ").map { it.toInt() }.toMutableList()
//    gnomeSort(myList)
    println(sillySort(myList))
}

fun gnomeSort(list: MutableList<Int>) {
    var index = 0
    while (index < list.size) {
        if (index == 0 || list[index] >= list[index - 1]) {
            index++
        } else {
            list[index] = list[index - 1].also { list[index - 1] = list[index] }
            index--
        }
    }
}

fun sillySort(list: MutableList<Int>): MutableList<Int> {
    return list.sorted().toMutableList()
}