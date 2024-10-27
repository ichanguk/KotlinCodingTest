package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import kotlin.math.pow

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val rMap = mapOf("black" to 0, "brown" to 1, "red" to 2,
        "orange" to 3, "yellow" to 4, "green" to 5,
        "blue" to 6, "violet" to 7, "grey" to 8, "white" to 9)

    val sum = rMap[readLine()]!! * 10 + rMap[readLine()]!!
    println(sum * 10.0.pow(rMap[readLine()]!!.toDouble()).toLong())
}