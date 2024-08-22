package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toLong()
    val nums = readLine().split(' ').map { it.toLong() }

    val d1 = 5 * (N - 2) * (N - 2) + 4 * (N - 2)
    val d2 = 8 * (N - 2) + 4
    val d3 = 4

    if (N == 1L) {
        println(nums.sum() - nums.max())
        return@with
    }

    var answer = d1 * nums.min()

    var tmp = Long.MAX_VALUE
    for (i in 0 until 6) {
        for (j in (i + 1) until 6) {
            if (i + j != 5) {
                tmp = minOf(tmp, nums[i] + nums[j])
            }
        }
    }
    answer += d2 * tmp

    tmp = 0

    for (i in 0 until 3) {
        tmp += minOf(nums[i], nums[5 - i])
    }

    answer += d3 * tmp

    println(answer)

}