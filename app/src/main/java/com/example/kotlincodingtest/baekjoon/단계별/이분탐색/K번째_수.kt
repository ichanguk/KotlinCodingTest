package com.example.kotlincodingtest.baekjoon.단계별.이분탐색

import java.io.BufferedReader
import kotlin.math.min

private var res = 0

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    kthNum(readLine().toInt(), readLine().toInt())
    println(res)
}

fun kthNum(n: Int, k: Int) {
    var low = 1
    var high = k
    var mid = (low + high) / 2

    var cnt:Long
    while (low <= high) {
        cnt = 0
        for (i in 1..n) {
            cnt += min(n, mid / i)
        }

        if (cnt >= k) {
            res = mid
            high = mid - 1
        } else {
            low = mid + 1
        }
        mid = (low + high) / 2
    }
}
