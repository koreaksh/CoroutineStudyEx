package s2

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout

fun main() = runBlocking {
    withTimeout(1300) {
        repeat(1000) {
            println("I'm sleeping $it ...")
            delay(500)
        }
    }
}