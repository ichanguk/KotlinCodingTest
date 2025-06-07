package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val nums = readLine().split(' ').map { it.toInt() }.sortedDescending().drop(1)

    println(nums.sum())
}