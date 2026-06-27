package org.example

fun String.isPalindrome() = this == this.reversed()

fun Int.factorial(): Long = (1..this).fold(1L) { acc, n -> acc * n }

fun List<Int>.safeAverage() =
    if (isEmpty()) 0.0 else this.sum().toDouble() / this.size

fun main() {
    println("level".isPalindrome())
    println("hello".isPalindrome())

    println(5.factorial())
    println(0.factorial())

    println(listOf(1, 2, 3).safeAverage())
    println(emptyList<Int>().safeAverage())
}