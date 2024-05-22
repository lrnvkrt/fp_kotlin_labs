package lab_1

fun main() {
    print("Введите количество дней: ")
    val num = readln().toInt()
    val years = num / 365
    var remainder = num - years*365
    val weeks = (remainder) / 7
    remainder -= weeks * 7
    println("Лет: $years, недель: $weeks, дней: $remainder")
}