package com.example.kotlincodingtest.baekjoon.단계별.약수_배수와_소수2

import java.io.BufferedReader
import kotlin.math.sqrt

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()
    var n = 0L
    for (i in 1..T) {
        n = readLine().toLong()
        if (n <= 1) {
            println(2)
            continue
        }
        while (!isPrime(n)) {
            n++
        }
        println(n)
    }
}

fun isPrime(n: Long): Boolean {
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0L) {
            return false
        }
    }
    return true
}

