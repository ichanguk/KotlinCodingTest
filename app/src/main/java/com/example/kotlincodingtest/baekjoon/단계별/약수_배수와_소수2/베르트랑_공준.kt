package com.example.kotlincodingtest.baekjoon.단계별.약수_배수와_소수2

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var n = readLine().toInt()
    val isPrime = MutableList<Boolean>(246913) { true }
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2.. Math.sqrt(246912.0).toInt()) {
        if (isPrime[i]) {
            for (j in i * i .. 246912 step i) {
                isPrime[j] = false
            }
        }
    }
    var cnt = 0
    while (n != 0) {
        cnt = 0
        for (i in (n + 1)..(2 * n)) {
            if (isPrime[i]) {
                cnt++
            }
        }
        println(cnt)
        n = readLine().toInt()
    }
}