package org.example

data class Config(var host: String = "", var port: Int = 0)

fun main() {
    val cfg = Config().apply {
        host = "localhost"
        port = 8080
    }
    println(cfg)

    val nums = mutableListOf(1, 2, 3)
        .also { println("Before: $it") }
        .apply { add(4) }
    println(nums)

    val upper = cfg.host.let { it.uppercase() + "!" }
    println(upper)
}