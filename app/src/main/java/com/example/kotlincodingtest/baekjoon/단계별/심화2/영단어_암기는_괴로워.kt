package com.example.kotlincodingtest.baekjoon.단계별.심화2

import java.io.BufferedReader
import java.io.BufferedWriter

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val engDict = mutableMapOf<String, Int>()

    var word = ""
    for (i in 1..N) {
        word = readLine()
        if (word.length >= M) {
            engDict[word] = engDict.getOrDefault(word, 0) + 1
        }
    }


    val bw = BufferedWriter(System.out.bufferedWriter())
    engDict.toList().sortedWith(
        compareByDescending<Pair<String, Int>> {
            it.second
        }.thenByDescending {
            it.first.length
        }.thenBy {
            it.first
        }
    ).forEach {
        bw.write(it.first)
        bw.newLine()
    }

    bw.flush()
    bw.close()
}