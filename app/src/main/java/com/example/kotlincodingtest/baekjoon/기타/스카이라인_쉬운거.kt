package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.util.Stack

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    var ans = 0

    val s = Stack<Int>()

    repeat(n) {
        val (x, y) = readLine().split(' ').map { it.toInt() }

        while(s.isNotEmpty() && s.peek() > y) {
            ans++
            s.pop()
        }

        if (s.isEmpty() || s.peek() != y) {
            s.push(y)
        }
    }

    while (s.isNotEmpty()) {
        if (s.pop() > 0) {
            ans++
        }
    }

    println(ans)
}