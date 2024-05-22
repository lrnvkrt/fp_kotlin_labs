package lab_7

import kotlinx.coroutines.*
import kotlin.random.Random
import kotlin.system.measureTimeMillis

suspend fun main() {

    CoroutineScope(Dispatchers.Default).launch {

        val results = mutableMapOf<Int, Boolean>()
        val time = measureTimeMillis {
            (0..100_000).map { index ->
                async {
                    checkEven(index)
                }
            }.map { deferred ->
                val result = deferred.await()
                results[result.first] = result.second
            }
        }

        val evenCount = results.count { it.value }
        println("Успешно выполнено: $evenCount")
        println("Общее время выполнение: $time")
    }.join()

}

fun checkEven(index: Int): Pair<Int, Boolean> {
    val number = Random.nextInt()
    val isEven = number % 2 == 0
    return Pair(index, isEven)
}

