package com.example.kotlincodingtest.baekjoon.단계별.시간복잡도

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (a1, a0) = readLine().split(' ').map { it.toInt() }
    val c = readLine().toInt()
    val n0 = readLine().toInt()
    val f_n0 = a1 * n0 + a0
    val c_g = c * n0
    if (c_g >= f_n0 && c >= a1) {
        println(1)
    } else {
        println(0)
    }

}