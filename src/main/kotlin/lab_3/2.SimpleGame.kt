package lab_3

fun main() {
    val predictedNum = (1..9).random()
    var userAssumption: Int

    do {
        println("Какое число было загадано?")
        userAssumption = readln().toInt()
        if (userAssumption != predictedNum) println("Не угадал! Попробуй снова.")
    } while(userAssumption != predictedNum)

    println("Ты угадал число! Молодец! Доставай зачётку!")
}