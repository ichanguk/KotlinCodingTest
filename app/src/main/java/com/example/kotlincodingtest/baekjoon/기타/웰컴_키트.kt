package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader


fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val shirts = readLine().split(' ').map { it.toInt() }
    val (T, P) = readLine().split(' ').map { it.toInt() }

    var cntS = 0
    shirts.forEach {
        if (it % T == 0) {
            cntS += it / T
        } else if (it > 0) {
            cntS += it / T + 1
        }
    }

    println(cntS)
    println("${N / P} ${N % P}")
}