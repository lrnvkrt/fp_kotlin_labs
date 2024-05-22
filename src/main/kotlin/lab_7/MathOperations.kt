package lab_7

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

suspend fun main() {
    CoroutineScope(Dispatchers.Default).launch {
        val deferred = async {
            recFunc(10)
        }

        println(deferred.await())
    }.join()
}

fun recFunc(n: Int): Long {
    return if (n <= 0) 1 else n + recFunc(n - 1) + recFunc(n - 2)
}