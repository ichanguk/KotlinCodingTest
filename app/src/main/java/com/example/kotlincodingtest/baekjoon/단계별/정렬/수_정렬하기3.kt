package com.example.kotlincodingtest.baekjoon.단계별.정렬

import java.io.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val nums = MutableList<Int>(10001) {0}

    for (i in 0 until N) {
        nums[readLine().toInt()]++
    }

    val bw = BufferedWriter(System.out.bufferedWriter())

    for (i in 1..10000) {
        for (j in 1..nums[i]) {
            bw.write("$i")
            bw.newLine()
        }
    }

    bw.flush()
    bw.close()
}