package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val scores = mutableListOf<Triple<Int, Int, Int>>()

    repeat(n) {
        val (country, num, score) = readLine().split(' ').map { it.toInt() }
        scores.add(Triple(country, num, score))
    }

    scores.sortByDescending { it.third }

    val count = mutableMapOf<Int, Int>()
    var cnt = 0

    var i = 0
    while (cnt < 3) {
        val cur = scores[i]
        if (count.getOrDefault(cur.first, 0) < 2) {
            println("${cur.first} ${cur.second}")
            count[cur.first] = count.getOrDefault(cur.first, 0) + 1
            cnt++
        }
        i++
    }
}