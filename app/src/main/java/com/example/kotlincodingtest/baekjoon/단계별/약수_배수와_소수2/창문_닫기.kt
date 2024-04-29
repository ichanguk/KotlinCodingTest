package com.example.kotlincodingtest.baekjoon.단계별.약수_배수와_소수2

import java.io.BufferedReader
import kotlin.math.sqrt

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toDouble()
    println(sqrt(N).toInt())
}