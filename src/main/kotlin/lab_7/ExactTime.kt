package lab_7

import kotlinx.coroutines.*
import java.time.LocalTime
import java.time.format.DateTimeFormatter

suspend fun main() {
    val wait = CoroutineScope(Dispatchers.Default).launch {
        timer()
    }


    wait.join()
}

suspend fun timer() {
    while (true) {
        val curTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH::mm::ss"))
        println(curTime)
        delay(1000)
    }
}