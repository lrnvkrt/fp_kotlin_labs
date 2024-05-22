package lab_6

import kotlin.math.sqrt

fun <T> transformIf(list: List<T>, condition: (T) -> Boolean, transformer: (T) -> T): List<T> {
    return list.map { if (condition(it)) transformer(it) else it }
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    for (i in 2..sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) return false
    }
    return true
}

fun main() {
    val numbers = listOf(4, 5, 9, 13, 21)
    val isNumPrime = { x: Int -> isPrime(x) }
    val squaring = { x: Int -> x * x }

    val result = transformIf(numbers, isNumPrime, squaring)
    println(result)
}