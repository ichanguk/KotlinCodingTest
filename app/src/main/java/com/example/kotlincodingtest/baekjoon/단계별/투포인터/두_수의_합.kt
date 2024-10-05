package com.example.kotlincodingtest.baekjoon.단계별.투포인터

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val nums = readLine().split(' ').map { it.toInt() }.sorted()
    val x = readLine().toInt()

    var answer = 0
    var s = 0
    var e = n - 1
    while (s < e) {
        if (nums[s] + nums[e] == x) {
            answer++
            s++
        } else if (nums[s] + nums[e] < x) {
            s++
        } else {
            e--
        }
    }

    println(answer)
}