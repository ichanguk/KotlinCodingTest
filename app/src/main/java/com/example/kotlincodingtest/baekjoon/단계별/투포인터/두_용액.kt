package com.example.kotlincodingtest.baekjoon.단계별.투포인터

import java.io.BufferedReader
import kotlin.math.abs

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val nums = readLine().split(' ').map { it.toInt() }.sorted()

    var s = 0
    var e = n - 1

    var ans = Integer.MAX_VALUE

    var sum:Int
    var n1 = nums[0]
    var n2 = nums[1]
    while (s < e) {
        sum = nums[s] + nums[e]
        if (abs(sum) < ans) {
            ans = abs(sum)
            n1 = nums[s]
            n2 = nums[e]
            if (sum == 0) {
                break
            }
        }

        if (sum < 0) {
            s++
        } else {
            e--
        }
    }

    println("$n1 $n2")

}