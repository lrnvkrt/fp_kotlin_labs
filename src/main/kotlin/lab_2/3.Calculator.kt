package lab_2

fun main() {
    println("У вас есть числа: 2 и 6.\n" +
            "Доступные действия: \n" +
            "1. Сложить \n" +
            "2. Вычесть \n" +
            "0. Ничего \n" +
            "Введите номер действия: ")
    val num = readln().toInt()
    val result = calculate(num)
    println("Результат: $result")
}

fun calculate(num: Int): Any {
    if (num == 1) {
        return 2+6
    }
    return if (num == 2) {
        2-6
    }
    else {
        "действие над числами произведено не было!"
    }
}

