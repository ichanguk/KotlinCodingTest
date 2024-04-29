package com.example.kotlincodingtest.baekjoon.단계별.약수_배수와_소수2

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (M, N) = readLine().split(' ').map { it.toInt() }
    val isPrime = MutableList<Boolean>(N + 1){true}
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2..Math.sqrt(N.toDouble()).toInt()) {
        if (isPrime[i]) {
            for (j in i * i..N step i) {
                isPrime[j] = false
            }
        }
    }

    for (i in M..N) {
        if (isPrime[i]) {
            println(i)
        }
    }
}