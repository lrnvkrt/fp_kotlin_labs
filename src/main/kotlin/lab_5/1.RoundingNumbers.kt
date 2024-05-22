package lab_5

fun main() {
    println("Введите число: ")
    val input = readln().toInt()
    println("Результат округления: ${roundingNumber(input)}")
}

fun roundingNumber(number: Int): String {
    return if (number > 999) {
        val listNum = number.toString()
        listNum.replaceRange(listNum.length-3, listNum.length, "K" )
    } else {
        number.toString()
    }
}