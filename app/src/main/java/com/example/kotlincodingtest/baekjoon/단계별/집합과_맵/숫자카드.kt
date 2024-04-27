package com.example.kotlincodingtest.baekjoon.단계별.집합과_맵

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    var cards = mutableSetOf<Int>()

    var st = StringTokenizer(readLine())
    for (i in 1..N) {
        cards.add(st.nextToken().toInt())
    }

    val M = readLine().toInt()
    st = StringTokenizer(readLine())
    for (i in 1..M) {
        if (cards.contains(st.nextToken().toInt())) {
            print("1 ")
        } else {
            print("0 ")
        }
    }
}