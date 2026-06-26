package org.example

data class User(val name: String, val age: Int)

sealed class ApiResult
data class Success(val data: String) : ApiResult()
data class Failure(val msg: String) : ApiResult()

fun fetch(ok: Boolean): ApiResult =
    if (ok) Success("Hello!") else Failure("Network fail")

fun main() {
    val u1 = User("Alice", 30)
    val u2 = u1.copy(age = 31)
    println(u1)
    println(u2)
    println(u1 == u2)

    when (val r = fetch(true)) {
        is Success -> println(r.data)
        is Failure -> println(r.msg)
    }
}