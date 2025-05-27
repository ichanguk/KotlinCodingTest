package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val s = mutableSetOf<Int>()
    var ans = 0
    repeat(5) {
        val num = readLine().toInt()
        if (s.contains(num)) {
            ans -= num
            s.remove(num)
        } else {
            ans += num
            s.add(num)
        }
    }
    println(ans)
}