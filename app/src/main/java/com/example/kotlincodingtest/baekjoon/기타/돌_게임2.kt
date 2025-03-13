package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n  = readLine().toInt()
    if (n % 2 == 0) {
        println("SK")
    } else {
        println("CY")
    }

}