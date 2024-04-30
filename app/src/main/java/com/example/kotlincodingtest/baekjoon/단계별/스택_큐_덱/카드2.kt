package com.example.kotlincodingtest.baekjoon.단계별.스택_큐_덱

import java.io.BufferedReader
import java.util.ArrayDeque

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val d = ArrayDeque<Int>()

    d.addAll(1..N)

    while (d.size >= 2) {
        d.removeFirst()
        d.add(d.removeFirst())
    }

    println(d.first)
}