package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val words = mutableListOf<String>(readLine())

    var flag:Boolean
    repeat(n - 1) {
        val input = readLine()
        flag = false

        for (w in words) {
            if (isCycle(input, w)) {
                flag = true
                break
            }
        }
        if (!flag) {
            words.add(input)
        }
    }

    println(words.size)
}

private fun isCycle(input: String, w: String): Boolean {
    if (input.length != w.length) {
        return false
    }

    val sb = StringBuilder(input)
    repeat(input.length) {
        if (w == sb.toString()) {
            return true
        }
        sb.append(sb[0])
        sb.deleteAt(0)
    }
    return false
}

