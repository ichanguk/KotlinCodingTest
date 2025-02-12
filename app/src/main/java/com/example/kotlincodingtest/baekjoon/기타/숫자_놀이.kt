package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var n = readLine().toInt()
    while (n != 0) {
        println(cal(n))
        n = readLine().toInt()
    }
}

private fun cal(n: Int): Int {
    var cur = n
    var ans = n
    while (ans >= 10) {
        ans = 0
        cur.toString().forEach {
            ans += it - '0'
        }
        cur = ans
    }
    return ans
}