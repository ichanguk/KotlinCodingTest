package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    repeat(readLine().toInt()) {
        val n = readLine()
        val s = mutableSetOf<Char>()

        n.forEach {
            s.add(it)
        }
        println(s.size)
    }
}