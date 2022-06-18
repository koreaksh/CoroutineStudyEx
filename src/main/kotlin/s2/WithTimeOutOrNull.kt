package s2

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

fun main() = runBlocking {
    val result = withTimeoutOrNull(1300) {
        repeat(1000) {
            println("I'm sleeping $it ...")
            delay(500)
        }
        "Done"
    }
    println("Result is $result")
}