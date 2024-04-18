package com.example.kotlincodingtest.baekjoon.조건

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val x = readLine().toInt()
    val y = readLine().toInt()

    if (x > 0 && y > 0) {
        println(1)
    } else if (y > 0) {
        println(2)
    } else if (x > 0) {
        println(4)
    } else {
        println(3)
    }
}