package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val zipMap = mutableMapOf<Char, String>()

    repeat(n) {
        val (pat, alp) = readLine().split(' ')
        zipMap[alp[0]] = pat
    }

    val original = readLine()
    val ans = StringBuilder()

    original.forEach {
        ans.append(zipMap[it])
    }

    val (s, e) = readLine().split(' ').map { it.toInt() }
    println(ans.substring(s - 1, e))
}