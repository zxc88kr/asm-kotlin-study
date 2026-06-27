package org.example

import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

suspend fun fetchData(id: Int): String {
    delay(1000.milliseconds)
    return "Data-$id"
}

fun main() = runBlocking {
    println("start")

    val d1 = async { fetchData(1) }
    val d2 = async { fetchData(2) }

    println(d1.await() + ", " + d2.await())
}