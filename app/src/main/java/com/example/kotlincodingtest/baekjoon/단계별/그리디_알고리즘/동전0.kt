package com.example.kotlincodingtest.baekjoon.단계별.그리디_알고리즘

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var (N, K) = readLine().split(' ').map { it.toInt() }
    val coinList = MutableList(N + 1) { 0 }
    for (i in 0 until N) {
        coinList[i] = readLine().toInt()
    }
    var cur = 0
    var cnt = 0
    for (i in (N - 1) downTo 0) {
        if (coinList[i] <= K) {
            cnt += K / coinList[i]
            cur += K / coinList[i] * coinList[i]
            K -= K / coinList[i] * coinList[i]
        }
        if (K == 0) {
            break
        }
    }
    println(cnt)


}