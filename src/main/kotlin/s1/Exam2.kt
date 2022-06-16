package s1

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    repeat(100_100) {
        launch {
            delay(1000)
            print(".")
        }
    }
}