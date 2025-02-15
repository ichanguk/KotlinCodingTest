package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var i = 1
    while (true) {
        val (l, p, v) = readLine().split(' ').map { it.toInt() }
        if (l == 0 && p == 0 && v == 0) {
            break
        }

        println("Case $i: ${l * (v / p) + minOf(v % p, l)}")
        i++

    }
}