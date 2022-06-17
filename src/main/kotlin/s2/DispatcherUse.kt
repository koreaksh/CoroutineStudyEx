package s2

import kotlinx.coroutines.*

//상황에맞는 Dispatcher 이용
//async 반환값이 필요한 경우 사용 반환은 Deferred

fun main() = runBlocking() {
    val arrayData = async(Dispatchers.IO) {
        println("dd")
        arrayOf(1, 3, 5, 4, 2)
    }
    val sortArray = async(Dispatchers.Default) {
        val value = arrayData.await()
        value.sortedBy { it }
    }

    val sortedArray = sortArray.await()
    println(sortedArray)

}