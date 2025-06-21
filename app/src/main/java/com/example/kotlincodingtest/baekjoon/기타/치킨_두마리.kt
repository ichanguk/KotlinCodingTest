package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val sum = readLine().split(' ').sumOf { it.toInt() }
    val price = readLine().toInt() * 2

    if (sum >= price) {
        println(sum - price)
    } else {
        println(sum)
    }
}