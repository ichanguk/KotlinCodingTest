package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val cranes = readLine().split(' ').map { it.toInt() }.sortedDescending()
    val m = readLine().toInt()
    val w = readLine().split(' ').map { it.toInt() }.sortedDescending().toMutableList()

    if (w[0] > cranes[0]) {
        println(-1)
        return@with
    }

    var ans = 0

    while (w.isNotEmpty()) {
        ans++
        var wIdx = 0
        var cIdx = 0

        while (cIdx < cranes.size) {
            if (wIdx == w.size) {
                break
            }
            if (cranes[cIdx] >= w[wIdx]) {
                w.removeAt(wIdx)
                cIdx++
            } else {
                wIdx++
            }
        }
    }

    println(ans)
}