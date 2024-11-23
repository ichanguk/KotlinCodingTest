package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, m) = readLine().split(' ')
    var ans = 0L

    n.forEach {a ->
        m.forEach {b ->
            ans += (a - '0') * (b - '0')
        }
    }

    println(ans)
}