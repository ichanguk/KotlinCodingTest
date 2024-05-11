package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()

    println(fact0(N))
}

fun fact0(n:Int): Int {
    var cur = 1
    var cnt = 0
    for (i in 2..n) {
        cur *= i
        while (cur % 10 == 0) {
            cur /= 10
            cnt++
        }
        if (cur > 1000) {
            cur %= 1000
        }
    }
    return cnt
}