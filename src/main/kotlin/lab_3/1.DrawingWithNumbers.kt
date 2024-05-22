package lab_3

fun main() {
    drawNumbers(5)
}

fun drawNumbers(n: Int) {
    (1..n).forEach { println("$it".repeat(it)) }
}