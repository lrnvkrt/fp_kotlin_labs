package lab_2

fun main() {
    print("Введите возраст: ")
    val age = readln().toInt()
    if (age >= 0) ageProcessing(age)
    else println("Серьёзно? Отрицательный возраст? Ошибка.")
}

fun ageProcessing(age: Int) {
    if (age > 18) {
        println("Вам уже всё можно")
    }
    if (age < 18) {
        println("Вы ещё слишком молоды")
    }
    if (age == 18) {
        println("Ура, Вам 18 лет!")
    }
}