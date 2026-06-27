package org.example

fun main() {
    val people = listOf(
        "Alice" to 30, "Bob" to 25, "Carol" to 30
    )

    val seniors = people
        .filter { it.second >= 28 }
        .map { it.first}
    println(seniors)

    val byAge = people.groupBy { it.second }
    println(byAge)

    val result = (1..1000).asSequence()
        .filter { it % 2 == 0 }
        .map { it * it }
        .take(3).toList()
    println(result)
}