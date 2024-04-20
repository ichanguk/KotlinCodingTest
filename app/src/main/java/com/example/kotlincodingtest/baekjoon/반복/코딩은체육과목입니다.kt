package com.example.kotlincodingtest.baekjoon.반복

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N: Int = readLine().toInt()

    for (i in 1..(N / 4)) {
        print("long ")
    }
    println("int")
}