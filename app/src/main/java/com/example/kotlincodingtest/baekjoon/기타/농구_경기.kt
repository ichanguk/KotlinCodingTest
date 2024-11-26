package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val cnt = IntArray('z' - 'a' + 1) { 0 }

    repeat(n) {
        cnt[readLine()[0] - 'a']++
    }

    val sb = StringBuilder()

    cnt.forEachIndexed { idx, c ->
        if (c >= 5) {
            sb.append('a' + idx)
        }
    }

    if (sb.isNotEmpty()) {
        println(sb.toString())
    } else {
        println("PREDAJA")
    }

}