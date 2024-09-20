package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val nums = readLine().split(' ').map { it.toInt() }.toMutableList()
    val n = readLine().toInt()

    nums.sort()

    var s = 1
    if (N == 1 && nums[0] < n) {
        s = n
    }
    var e = 1000

    for (i in nums.indices) {
        if (nums[i] > n) {
            e = nums[i] - 1
            if (i > 0) {
                s = nums[i - 1] + 1
            }
            break
        }
    }

    if (s == n + 1) {
        println(0)
    } else {
        println((e - n + 1) * (n - s + 1) - 1)
    }
}