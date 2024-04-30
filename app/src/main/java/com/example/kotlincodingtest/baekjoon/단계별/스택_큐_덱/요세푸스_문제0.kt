package com.example.kotlincodingtest.baekjoon.단계별.스택_큐_덱

import java.io.BufferedReader
import java.util.ArrayDeque

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, K) = readLine().split(' ').map { it.toInt() }
    val d = ArrayDeque<Int>()
    val res = MutableList<Int>(N) { 0 }

    d.addAll(1..N)
    for (i in res.indices) {
        for (j in 1 until K) {
            d.add(d.removeFirst())
        }
        res[i] = d.removeFirst()
    }
    print('<')
    for (i in res.indices) {
        print(res[i])
        if (i != N - 1) {
            print(", ")
        } else {
            println('>')
        }
    }
}