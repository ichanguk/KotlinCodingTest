package com.example.kotlincodingtest.baekjoon.단계별.이분탐색

import java.io.BufferedReader

private var pointList = mutableListOf<Int>()
private var res = 0

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, C) = readLine().split(' ').map { it.toInt() }

    pointList = MutableList(N) { 0 }

    for (i in 0 until N) {
        pointList[i] = readLine().toInt()
    }

    pointList.sort()

    installModem(C)
    println(res)
}

fun installModem(c: Int) {
    var low = 1
    var high = pointList[pointList.size - 1] - pointList[0]
    var mid = (low + high) / 2

    var cnt:Int
    var cur:Int
    while (low <= high) {
        cnt = 1
        cur = pointList[0]
        for (i in 1 until pointList.size) {
            if (pointList[i] - cur >= mid) {
                cnt++
                cur = pointList[i]
            }
        }
        if (cnt >= c) {
            res = mid
            low = mid + 1
        } else {
            high = mid - 1
        }
        mid = (low + high) / 2
    }

}

