package com.example.kotlincodingtest.baekjoon.단계별.정렬

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val nums = MutableList<Int>(5){0}
    for (i in 0 until 5) {
        nums[i] = readLine().toInt()
    }

    println(nums.average().toInt())
    nums.sort()
    println(nums[2])
}