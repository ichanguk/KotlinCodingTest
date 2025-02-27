package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.io.BufferedWriter

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val k = readLine().toInt()
    val password = readLine()

    val arr = Array(password.length / k) { CharArray(k) { ' ' } }

    for (i in 0 until password.length / k) {
        for (j in 0 until k) {
            if (i % 2 == 0) {
                arr[i][j] = password[i * k + j]
            } else {
                arr[i][j] = password[(i + 1) * k - (j + 1)]
            }
        }
    }

    val bw = BufferedWriter(System.out.bufferedWriter())

    for (j in 0 until k) {
        for (i in 0 until password.length / k) {
            bw.write(arr[i][j].toString())
        }
    }

    bw.flush()
    bw.close()

}