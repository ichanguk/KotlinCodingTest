package com.example.kotlincodingtest.baekjoon.단계별.약수_배수와_소수

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, K) = readLine().split(' ').map { it.toInt() }

    var divisorList = MutableList<Int>(0) { 0 }

    for (i in 1..Math.sqrt(N.toDouble()).toInt()) {
        if (N % i == 0) {
            divisorList.add(i)
            if (N / i != i) {
                divisorList.add(N / i)
            }
        }
    }

    if (divisorList.size < K) {
        println(0)
    } else {
        divisorList.sort()
        println(divisorList[K - 1])
    }
}