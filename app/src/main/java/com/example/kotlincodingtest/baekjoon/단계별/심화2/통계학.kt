package com.example.kotlincodingtest.baekjoon.단계별.심화2

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    var numMap = mutableMapOf<Int, Int>()
    val numList = MutableList<Int>(N){0}

    var num = 0
    var sum = 0
    for (i in 0 until N) {
        num = readLine().toInt()
        numMap[num] = numMap.getOrDefault(num, 0) + 1
        sum += num
        numList[i] = num
    }

    println(Math.round((sum.toDouble() / N)).toInt())
    numList.sort()
    println(numList[N / 2])
    val sortedMap = numMap.toList()
        .sortedWith(
            compareBy<Pair<Int, Int>> {
                it.second
            }.thenByDescending {
                it.first
            }
        )

    val modeCnt = sortedMap[sortedMap.size - 1].second
    var mode = sortedMap[sortedMap.size - 1].first

    if (sortedMap.size >= 2 && modeCnt == sortedMap[sortedMap.size - 2].second) {
        mode = sortedMap[sortedMap.size - 2].first
    }
    println(mode)
    println(numList[N - 1] - numList[0])

}