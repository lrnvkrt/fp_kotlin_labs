package lab_2

import kotlin.math.abs

fun main() {
    print("Введите значение прибыли: ")
    val profit = readln().toInt()
    print("Введите значение убытков: ")
    val losses = readln().toInt()
    if (profit < 0 || losses < 0) println("Если прибыль (убытки) отрицательная(-ые), то это убытки (прибыль). Возможно, вы перепутали поля! Попробуйте снова!")
    else {
        val difference = profit-losses
        if (difference > 0) {
            println("Ваша прибыль составила: $difference")
        } else {
            println("Ваши убытки составили: ${abs(difference)}")
        }
    }

}