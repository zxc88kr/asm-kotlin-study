package org.example

class InsufficientFundsException(msg: String) : Exception(msg)

fun withdraw(balance: Int, amount: Int): Int {
    if (amount > balance)
        throw InsufficientFundsException("잔액 부족!")
    return balance - amount
}

fun main() {
    val age = try { "25".toInt() } catch (e: Exception) { 0 }
    println(age)

    runCatching { withdraw(1000, 500) }
        .onSuccess { println("잔액: $it") }
        .onFailure { println("오류: ${it.message}") }

    val v = runCatching { "abc".toInt() }.getOrDefault(-1)
    println(v)
}