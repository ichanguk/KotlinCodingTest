package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val input = readLine()
    val charList = readLine().split(' ')

    val ans = StringBuilder()
    input.forEach {
        var flag = false
        for (c in charList) {
            if (it.toString() == c) {
                flag = true
                break
            }
        }
        if (flag) {
            ans.append(it.lowercase())
        } else {
            ans.append(it)
        }
    }
    println(ans.toString())
}