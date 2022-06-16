package s1

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        repeat(5) {
            println("Coroutine A, $it")
            delay(10)
        }
    }

    launch {
        repeat(5) {
            println("Coroutine B, $it")
            delay(10)
        }
    }

    println("Coroutine outer")
}

fun <T>println(msg: T) {
    kotlin.io.println("$msg [${Thread.currentThread().name}]")
}