package com.example.kotlincodingtest.baekjoon.단계별.정렬

import java.io.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val nums = MutableList<Int>(N) {0}

    for (i in 0 until N) {
        nums[i] = readLine().toInt()
    }

    nums.sort()

    nums.forEach {
        println(it)
    }
}