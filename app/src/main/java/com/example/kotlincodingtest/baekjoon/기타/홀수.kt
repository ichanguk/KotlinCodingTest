package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val nums = mutableListOf<Int>()
    repeat(7) {
        val num = readLine().toInt()
        if (num % 2 == 1) {
            nums.add(num)
        }
    }

    if (nums.isEmpty()) {
        println(-1)
    } else {
        println(nums.sum())
        println(nums.min())
    }

}