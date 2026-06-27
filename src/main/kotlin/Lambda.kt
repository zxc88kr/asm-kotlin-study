package org.example

fun applyOp(n: Int, op: (Int) -> Int) = op(n)

fun makeMultiplier(factor: Int): (Int) -> Int = { it * factor }

fun main() {
    val square: (Int) -> Int = { it * it }
    println(square(5))

    println(applyOp(4) { it + 10 })

    val triple = makeMultiplier(3)
    println(triple(7))

    val odds = (1..5)
        .filter { it % 2 != 0 }
        .map { it * 10 }
    println(odds)
}