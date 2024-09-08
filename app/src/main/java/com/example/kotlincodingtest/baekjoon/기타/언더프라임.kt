package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (a, b) = readLine().split(' ').map { it.toInt() }

    val isPrime = BooleanArray(b + 1) { true }
    isPrime[0] = false
    isPrime[1] = false

    val count = IntArray(b + 1) { 0 }

    for (i in 2..b) {
        if (isPrime[i]) {
            for (j in (i + i) .. b step i) {
                isPrime[j] = false
                var cur = j
                while (cur % i == 0) {
                    cur /= i
                    count[j]++
                }
            }
        }
    }

    var ans = 0

    for (i in a..b) {
        if (isPrime[count[i]]) {
            ans++
        }
    }

    println(ans)

}