package com.example.kotlincodingtest.baekjoon.단계별.정렬

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var N = readLine().toCharArray()

    N.sortDescending()
    println(N)

}