package s3

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = async {doSomethingUsefulOne()}
        val one1 = one.await()
        val two = async { doSomethingUsefulTwo() }
        println("The answer is ${one1 + two.await()}")
    }
    println("Completed in $time ms")
}

private suspend fun doSomethingUsefulOne() : Int {
    delay(1000)
    return 13
}
private suspend fun doSomethingUsefulTwo() : Int {
    delay(1000)
    return 29
}

