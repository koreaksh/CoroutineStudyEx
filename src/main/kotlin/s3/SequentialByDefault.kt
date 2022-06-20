package s3

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = doSomethingUsefulOne()
        val two = doSomethingUsefulTwo()
        println("The answer is ${one + two}")
    }
    println("Completed in $time ms")
}
private suspend fun doSomethingUsefulOne() : Int {
    println("one")
    delay(1000)
    println("one")
    return 13
}

private suspend fun doSomethingUsefulTwo() : Int {
    println("two")
    delay(1000)
    println("two")
    return 29
}