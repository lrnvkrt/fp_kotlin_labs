package lab_7

import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.withTimeout

const val oneSecond = 1000L

suspend fun main() {
    val longerThanOne: suspend () -> Int = {
        delay(oneSecond + 100)
        100
    }

    val shorterThanOne: suspend () -> Int = {
        delay(oneSecond - 100)
        55
    }

    println(withTimeoutOrDefault(oneSecond, shorterThanOne, 0))
    println(withTimeoutOrDefault(oneSecond, longerThanOne, 0))
}


// Возвращает либо значение поулченное из block либо default при истечении времени
suspend fun <T> withTimeoutOrDefault(timeout: Long, block: suspend () -> T, default: T): T {
    return try {
        withTimeout(timeout) {
            block()
        }
    } catch (e: TimeoutCancellationException) {
        println("Too long body execution")
        default
    }
}