package com.example.myexercices

import kotlin.math.*

fun main() {
    println("Hello, Kotlin Apprentice reader!")
    println("--------------------------------")
    println(2 + 6)
    println("--------------------------------")
    println(10 - 2)
    println("--------------------------------")
    println(2 * 4)
    println("--------------------------------")
    println(24 / 3)
    println("--------------------------------")
    println( 28 % 10)
    println("--------------------------------")
    val banana = ( 28.0 % 10.0)
    println(banana)
    println("--------------------------------")
    println("%.0f".format(banana))
    println("--------------------------------")
    println(1 shl 3)
    println("--------------------------------")
    println(32 shl 2)
    println("--------------------------------")
    println(((8000 / (5 * 10)) - 32) shr (29 % 5))
    println("--------------------------------")
    println( 350 / 5 + 2)
    println("--------------------------------")
    println( 350 / (5 + 2))
    println("--------------------------------")

    println(sin(45 * PI / 180))
    //calcula o seno
    println("--------------------------------")

    println(cos( 135 * PI / 180))
    //calcula o cosseno
    println("--------------------------------")

    println(sqrt(2.0))
    //calcula a raiz quadrada
    println("--------------------------------")

    println(max(5, 10))
    println("--------------------------------")

    println(min(-5, -10))
    println("--------------------------------")

    println(max(sqrt(2.0), PI / 2))
    println("--------------------------------")


}