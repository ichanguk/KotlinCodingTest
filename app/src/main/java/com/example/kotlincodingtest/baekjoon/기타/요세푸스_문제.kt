package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, k) = readLine().split(' ').map { it.toInt() }
    val q = ArrayDeque<Int>()

    repeat(n) {
        q.addLast(it + 1)
    }

    var cnt = 1
    var cur:Int
    val sb = StringBuilder("<")

    while (q.isNotEmpty()) {
        cur = q.removeFirst()
        if (cnt == k) {
            sb.append(cur)
            sb.append(", ")
            cnt = 1
        } else {
            q.addLast(cur)
            cnt++
        }
    }

    sb.delete(sb.length - 2, sb.length)
    sb.append(">")

    println(sb.toString())
}