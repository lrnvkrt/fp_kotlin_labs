package lab_5

fun main() {
    println("Введите возраст:")
    val age = readln().toInt()
    println("$age ${age.correctYearsEnding()}")
}

fun Int.correctYearsEnding(): String {
    return when {
        this % 100 in 11..19 -> "лет"
        this % 10 == 1 -> "год"
        this % 10 in 2..4 -> "года"
        else -> "лет"
    }
}
