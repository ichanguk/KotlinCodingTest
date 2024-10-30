package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val wordsMap = mutableMapOf<String, Int>()
    repeat(n) {
        val word = readLine()
        wordsMap[word] = wordsMap.getOrDefault(word, 0) + 1
    }

    val bestSeller = wordsMap.toList().sortedWith(
        compareByDescending<Pair<String, Int>> {
            it.second
        }.thenBy{
            it.first
        }
    ).first()

    println(bestSeller.first)
}