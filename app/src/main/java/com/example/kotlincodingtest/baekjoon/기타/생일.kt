package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val birthday = mutableListOf<Pair<Int, String>>()

    repeat(n) {
        val (name, d, m, y) = readLine().split(' ')

        birthday.add(Pair(d.toInt() + (m.toInt() * 12) + (y.toInt() * 365), name))

        birthday.sortBy { it.first }
    }

    println(birthday[n - 1].second)
    println(birthday[0].second)
}