package lab_1

fun main() {
    print("Введите четырёхзначное число: ")
    val num = readln()
    if (isValid(num)) {
        splitWithArray(num)
        splitWithRemainder(num.toInt())
    } else {
        println("Введено не четырёхзначное число!")
    }
}

fun splitWithArray(num: String) {
    println("Результат: " + num.toCharArray().joinToString(", "))
}

fun isValid(num: String): Boolean {
    return num.length == 4 && num.all { it.isDigit() }
}

fun splitWithRemainder(num: Int) {
    println("Результат: " + (num) / 1000 + ", "
        + (num%1000) / 100 + ", "
        + (num%100) / 10 + ", "
        + num%10)
}