package s2

import kotlinx.coroutines.*
import java.lang.Exception

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        try {
            var nextPrintTime = startTime
            var i = 0
            while (i < 5) {
                if (System.currentTimeMillis() >= nextPrintTime) {
                    yield()
                    println("job: I'm sleeping ${i++} ...")
                    nextPrintTime += 500
                }
            }
        } catch (e : Exception) {
            println("Exception $e ...")
        }
    }
    delay(1300)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin()
    println("main: Now I can quit.")
}