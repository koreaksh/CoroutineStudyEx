package s2

import kotlinx.coroutines.*

//상황에맞는 Dispatcher 이용

fun main() = runBlocking() {
    val arrayData = async(Dispatchers.IO) {
        arrayOf(1, 3, 5, 4, 2)
    }
    val sortArray = async(Dispatchers.Default) {
        val value = arrayData.await()
        value.sortedBy { it }
    }

    val sortedArray = sortArray.await()
    println(sortedArray)

}