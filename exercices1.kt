package com.example.myexercices

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    //Desafio 1
    val exercices = 9
    var exercicesSolvd = 0
    exercicesSolvd += 1
    println(exercicesSolvd)

    //Desafio 2
    var age = 16
    println(age)
    age = 30
    println(age)
    exercicesSolvd += 1
    println(exercicesSolvd)

    //desafio 3
    val a: Int = 46
    val b: Int = 10

    // 1
    val answer1: Int = (a * 100) + b
    println(answer1)
    // 2
    val answer2: Int = (a * 100) + (b * 100)
    println(answer2)
    //3
    val answer3: Int = (a * 100) + (b / 10)
    println(answer3)
    exercicesSolvd += 1
    println(exercicesSolvd)

    //Desafio 4
    val calculo = (5 * 3 - (4 / 2) * 2)
    println(calculo)
    exercicesSolvd += 1
    println(exercicesSolvd)

    //Desafio 5
    var amarelo: Double = 100.23324
    var banana: Double = 5.332452
    val average = amarelo + banana / 2
    println(average)
    exercicesSolvd += 1
    println(exercicesSolvd)

    //Desafio 6
    val fahrenheit: Double = 66.2
    val convert: Double = 1.8

    val count = 32

    val celcius = (fahrenheit - count) / convert

    println("$celcius graus Celcius")
    exercicesSolvd += 1
    println(exercicesSolvd)

    //Desafio 7
    val position = 55
    val row = position / 8
    val column = position % 8

    println("Linha: $row, coluna: $column")
    exercicesSolvd += 1
    println(exercicesSolvd)

    //Desafio 8
    val degrees: Double = 89.0
    val radians = degrees * PI / 180

    println("Radians: $radians")
    exercicesSolvd += 1
    println(exercicesSolvd)

    //Desafio 9
    val x1: Double = 4.0
    val x2: Double = 9.0
    val y1: Double = -3.0
    val y2: Double = 4.0
    val distance = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))

    println(distance)
}
