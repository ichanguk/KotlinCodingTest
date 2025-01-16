package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val m = readLine().toInt()
    val nums = readLine().split(' ').map { it.toInt() }.sortedDescending()

    var l = 0
    var r = n - 1

    var ans = 0

    while (l < r) {
        when (nums[l] + nums[r]) {
            m -> {
                ans++
                l++
                r--
            }
            in 0 until m -> {
                r--
            }
            else -> {
                l++
            }
        }
    }

    println(ans)

}