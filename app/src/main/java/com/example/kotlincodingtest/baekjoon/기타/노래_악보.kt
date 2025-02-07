package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, q) = readLine().split(' ').map { it.toInt() }
    val music = mutableListOf<Int>()

    repeat(n) { cur ->
        repeat(readLine().toInt()) {
            music.add(cur + 1)
        }
    }

    repeat(q) {
        println(music[readLine().toInt()])
    }

}