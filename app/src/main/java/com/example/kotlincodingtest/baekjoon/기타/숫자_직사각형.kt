package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val nums = Array(N) { IntArray(M) { 0 } }

    for (i in 0 until N) {
        val input = readLine()

        for (j in 0 until M) {
            nums[i][j] = input[j] - '0'
        }
    }

    var answer = minOf(N, M)
    var cur:Int
    var flag = false
    while (answer > 1) {
        for (i in 0 .. (N - answer)) {
            for (j in 0 .. (M - answer)) {
                cur = nums[i][j]
                if (nums[i][j + answer - 1] == cur &&
                    nums[i + answer - 1][j] == cur &&
                    nums[i + answer - 1][j + answer - 1] == cur) {
                    flag = true
                    break
                }
            }
        }
        if (flag) {
            break
        }
        answer--
    }

    println(answer * answer)
}