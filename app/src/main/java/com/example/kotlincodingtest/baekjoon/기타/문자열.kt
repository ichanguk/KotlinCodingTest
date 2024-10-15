package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (a, b) = readLine().split(' ')

    var cnt:Int
    var ans = a.length
    for (i in 0 .. b.length - a.length) {
        cnt = 0

        b.substring(i, i + a.length).forEachIndexed { index, c ->
            if (a[index] != c) {
                cnt++
            }
        }

        ans = minOf(ans, cnt)
    }

    println(ans)
}