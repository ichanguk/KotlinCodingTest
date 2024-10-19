package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val a = readLine().split(' ').map { it.toInt() }.toMutableSet()
    val b = readLine().split(' ').map { it.toInt() }.toSet()

    val c = a - b

    println(c.size)
    if (c.isNotEmpty()) {
        c.toList().sorted().forEach {
            print("$it ")
        }
    }

}