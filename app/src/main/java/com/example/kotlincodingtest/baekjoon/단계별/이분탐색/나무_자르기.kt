package com.example.kotlincodingtest.baekjoon.단계별.이분탐색

import java.io.BufferedReader

private var trees = listOf<Long>()
private var ans = 0L

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    trees = readLine().split(' ').map { it.toLong() }

    cut(M)
    println(ans)
}

private fun cut(m: Int) {
    var low = 1L
    var high = trees.max()
    var mid = (low + high) / 2

    var cnt:Long
    while (low <= high) {
        cnt = 0
        trees.forEach {
            if (it > mid) {
                cnt += it - mid
            }
        }
        if (cnt >= m) {
            ans = mid
            low = mid + 1
        } else {
            high = mid - 1
        }
        mid = (low + high) / 2
    }
}