package lab_2

fun main() {
    print("Введите номер дня недели: ")
    when(readln()) {
        "1" -> println("Понедельник")
        "2" -> println("Вторник")
        "3" -> println("Среда")
        "4" -> println("Четверг")
        "5" -> println("Пятница")
        "6" -> println("Суббота")
        "7" -> println("Воскресенье")
    }
}