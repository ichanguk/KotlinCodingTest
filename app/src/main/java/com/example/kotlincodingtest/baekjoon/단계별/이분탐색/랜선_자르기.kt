package com.example.kotlincodingtest.baekjoon.단계별.이분탐색

import java.io.BufferedReader

private var LANCable = mutableListOf<Long>()
private var ans = 0L

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (K, N) = readLine().split(' ').map { it.toInt() }
    LANCable = MutableList(K) { 0L }
    for (i in 0 until K) {
        LANCable[i] = readLine().toLong()
    }
    LANCable.sort()
    cut(N)
    println(ans)
}

fun cut(n: Int) {
    var low = 1L
    var high = LANCable[LANCable.size - 1]
    var mid = (low + high) / 2

    while (low <= high) {
        var cnt = 0L
        LANCable.forEach {
            cnt += it / mid
        }
        if (cnt >= n) {
            ans = mid
            low = mid + 1
        } else {
            high = mid - 1
        }
        mid = (low + high) / 2
    }
}

