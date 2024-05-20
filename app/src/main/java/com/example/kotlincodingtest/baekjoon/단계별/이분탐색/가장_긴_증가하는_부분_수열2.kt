package com.example.kotlincodingtest.baekjoon.단계별.이분탐색

import java.io.BufferedReader

private var nums = listOf<Int>()
private var ans = mutableListOf<Int>()

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    nums = readLine().split(' ').map { it.toInt() }
    ans.add(nums[0])

    for (i in 1 until N) {
        if (nums[i] > ans[ans.size - 1]) {
            ans.add(nums[i])
        } else {
            ans[findNum(nums[i])] = nums[i]
        }
        println(ans)
    }
    println(ans.size)
}

fun findNum(num:Int):Int {
    var low = 0
    var high = ans.size - 1
    var mid = (low + high) / 2

    while (low < high) {
        if (ans[mid] >= num) {
            high = mid
        } else {
            low = mid + 1
        }
        mid = (low + high) / 2
    }
    return high
}

