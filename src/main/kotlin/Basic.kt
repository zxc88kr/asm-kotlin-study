package org.example

fun greet(name: String): String {
    return "Hello, $name!"
}

fun add(a: Int, b: Int) = a + b

fun main() {
    val name = "Kotlin"
    var count = 0
    count += 1

    println(greet(name))
    println("count = $count")
    println(add(3, 4))

    val pi = 3.14
    println("pi = $pi")
}