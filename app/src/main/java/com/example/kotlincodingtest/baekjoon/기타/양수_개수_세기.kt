package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val nums = readLine().split(' ').map { it.toInt() }

    println(nums.count { it > 0 })
}