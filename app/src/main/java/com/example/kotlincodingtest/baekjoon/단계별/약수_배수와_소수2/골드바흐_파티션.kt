package com.example.kotlincodingtest.baekjoon.단계별.약수_배수와_소수2

import java.io.BufferedReader
import java.io.BufferedWriter
import kotlin.math.sqrt

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()
    val maxN = 1_000_000
    val isPrime = MutableList<Boolean>(maxN + 1) { true }
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2..sqrt(maxN.toDouble()).toInt()) {
        if (isPrime[i]) {
            for (j in i * i..maxN step i) {
                isPrime[j] = false
            }
        }
    }

    var n = 0
    var cnt = 0
    val bw = BufferedWriter(System.out.bufferedWriter())
    for (i in 1..T) {
        cnt = 0
        n = readLine().toInt()
        for (j in 2..(n / 2)) {
            if (isPrime[j] && isPrime[n - j]) {
                cnt++
            }
        }
        bw.write("$cnt\n")
    }
    bw.flush()
    bw.close()
}