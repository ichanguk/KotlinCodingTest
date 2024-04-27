package com.example.kotlincodingtest.baekjoon.단계별.집합과_맵

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val cards = mutableMapOf<Int, Int>()
    var st = StringTokenizer(readLine())
    var num = 0
    for (i in 1..N) {
        num = st.nextToken().toInt()
        cards[num] = cards.getOrDefault(num, 0) + 1
    }

    val M = readLine().toInt()
    st = StringTokenizer(readLine())
    val bw = BufferedWriter(System.out.bufferedWriter())
    for (i in 1..M) {
        bw.write("${cards.getOrDefault(st.nextToken().toInt(), 0)} ")
    }
    bw.flush()
    bw.close()
}