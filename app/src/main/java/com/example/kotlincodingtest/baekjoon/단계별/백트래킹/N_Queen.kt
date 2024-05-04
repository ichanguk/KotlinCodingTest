package com.example.kotlincodingtest.baekjoon.단계별.백트래킹

import java.io.BufferedReader

var board = mutableListOf<MutableList<Boolean>>()

private var N = 0
private var cnt = 0
private var rowColVisit = mutableListOf<Boolean>()
private var croVisit = mutableListOf<Boolean>()
private var croRevVisit = mutableListOf<Boolean>()

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    N = readLine().toInt()
    board = MutableList(N) { MutableList<Boolean>(N) { false } }
    rowColVisit = MutableList<Boolean>(N) { false }
    croVisit = MutableList<Boolean>(2 * N - 1) { false }
    croRevVisit = MutableList<Boolean>(2 * N - 1) {false}
    nQueen(0)
    println(cnt)
}

fun nQueen(n: Int) {
    if (n == N) {
        cnt++
        return
    }
    for (i in 0 until N) {
        if (!rowColVisit[i] && !croVisit[n + i] && !croRevVisit[n - i + N - 1]) {
            reverseVisit(i, n)
            nQueen(n + 1)
            reverseVisit(i, n)
        }
    }
}

fun reverseVisit(i: Int, n: Int) {
    rowColVisit[i] = !rowColVisit[i]
    croVisit[n + i] = !croVisit[n + i]
    croRevVisit[n - i + N - 1] = !croRevVisit[n - i + N - 1]
}
