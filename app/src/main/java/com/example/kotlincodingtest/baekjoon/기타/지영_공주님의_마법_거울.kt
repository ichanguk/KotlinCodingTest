package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val mirror = mutableListOf<String>()

    repeat(n) {
        mirror.add(readLine())
    }

    val cmd = readLine().toInt()

    when (cmd) {
        1 -> {
            mirror.forEach {
                println(it)
            }
        }
        2 -> {
            mirror.forEach {
                println(it.reversed())
            }
        }
        3 -> {
            for (i in n - 1 downTo 0) {
                println(mirror[i])
            }
        }
    }
}