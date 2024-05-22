package lab_3

import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    val input = readln().toInt()
    println(findDivisorsOfNumber(input))
}

fun findDivisorsOfNumber(number: Int): String {
    val sqrtNumber = sqrt(abs(number.toDouble())).toInt()
    return (1..sqrtNumber).fold(mutableListOf<Int>()) { acc, i ->
        if (number % i == 0) {
            acc.apply {
                add(i)
                if (i != number / i) add(number / i)
            }
        } else acc
    }.sorted().joinToString(", ")
//    return positiveDivisors.flatMap { listOf(it, -it) }.distinct().sorted().joinToString(", ")
}
