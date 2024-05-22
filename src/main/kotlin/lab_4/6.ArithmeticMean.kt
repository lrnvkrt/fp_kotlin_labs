package lab_4

fun main() {
    println("Введите элементы списка через запятую:")
    val myList = readln().split(", ").map { it.toInt() }.toMutableList()
    val arithmeticMean = myList.sum().toDouble() / myList.size
    println("""
        Среднее арифметическое равно: $arithmeticMean
        Элементы листа, которые больше среднего арифметического: ${myList.filter { it > arithmeticMean }}
    """.trimIndent())
}