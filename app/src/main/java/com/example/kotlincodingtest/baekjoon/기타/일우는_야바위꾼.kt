package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, x, k) = readLine().split(' ').map { it.toInt() }

    var cur = x;

    repeat(k) {
        val (a, b) = readLine().split(' ').map { it.toInt() }

        if (a == cur) {
            cur = b
        } else if (b == cur) {
            cur = a
        }
    }

    println(cur)
}