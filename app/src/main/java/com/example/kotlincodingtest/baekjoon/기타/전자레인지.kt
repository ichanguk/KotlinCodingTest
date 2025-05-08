package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var n = readLine().toInt()

    var (a, b, c) = intArrayOf(0, 0, 0)

    a = n / 300
    n %= 300

    b = n / 60
    n %= 60

    c = n / 10
    n %= 10

    if (n == 0) {
        println("$a $b $c")
    } else {
        println(-1)
    }
}