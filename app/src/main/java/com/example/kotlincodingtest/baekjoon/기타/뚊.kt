package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, m) = readLine().split(' ').map { it.toInt() }

    val origins = mutableListOf<String>()

    for (i in 0 until n) {
        val sb = StringBuilder()
        readLine().forEach { c ->
            repeat(2) {
                sb.append(c)
            }
        }
        origins.add(sb.toString())
    }

    for (i in 0 until n) {
        if (origins[i] != readLine()) {
            println("Not Eyfa")
            return@with
        }
    }

    println("Eyfa")
}