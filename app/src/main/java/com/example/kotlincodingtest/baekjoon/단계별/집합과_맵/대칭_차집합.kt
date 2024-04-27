package com.example.kotlincodingtest.baekjoon.단계별.집합과_맵

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val ASet = mutableSetOf<Int>()
    val BSet = mutableSetOf<Int>()

    var st = StringTokenizer(readLine())
    for (i in 1..N) {
        ASet.add(st.nextToken().toInt())
    }

    st = StringTokenizer(readLine())
    for (i in 1..M) {
        BSet.add(st.nextToken().toInt())
    }

    val ADiffB = ASet - BSet
    val BDiffA = BSet - ASet

    println((ADiffB + BDiffA).size)
}