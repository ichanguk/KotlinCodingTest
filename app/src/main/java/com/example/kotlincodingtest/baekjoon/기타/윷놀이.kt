package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    repeat(3) {
        val yut = readLine().split(' ').map { it.toInt() }.sum()

        if (yut == 4) {
            println('E')
        } else {
            println('D' - yut)
        }
    }
}