package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()

    if (N <= 10) {
        println(N)
        return@with
    }
    val nums = mutableListOf<Long>()

    for (i in 0 until 10) {
        bt(i.toLong(), 1, nums)
    }

    if (N >= nums.size) {
        println("-1")
    } else {
        nums.sort()
        println(nums[N])
    }
}

private fun bt(num:Long, idx:Int, nums: MutableList<Long>) {
    if (idx > 10) {
        return
    }

    nums.add(num)
    for (i in 0 until num % 10) {
        bt(num * 10 + i, idx + 1, nums)
    }
}