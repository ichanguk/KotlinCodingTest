package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine()
    val nums = arrayOf("000", "001", "010", "011", "100", "101", "110", "111")

    val ans = StringBuilder()

    n.forEach {
        ans.append(nums[it - '0'])
    }

    while (ans.isNotEmpty() && ans.first() == '0') {
        ans.deleteAt(0)
    }

    if (ans.isEmpty()) {
        println(0)
    } else {
        println(ans.toString())
    }

}