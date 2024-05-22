package lab_4

fun main() {
    val fNum = (-10..10).random()
    val sNum = (-10..10).random()

    val min: Int
    val max: Int
    if (fNum < sNum) {
        min = fNum
        max = sNum
    } else {
        min = sNum
        max = fNum
    }

    val listOfNumberInRange = IntRange(min, max).toList()
    println("Массив чисел из диапазона от $min до $max включительно: ${listOfNumberInRange.joinToString(", ")}")
}