package org.example

fun getUser(id: Int): String? =
    if (id == 1) "Alice" else null

fun main() {
    val user: String? = getUser(1)
    println(user?.length)

    val name = getUser(99) ?: "Guest"
    println(name)

    getUser(1)?.let { u ->
        println("Found: $u")
    }

    // getUser(99)!!
}