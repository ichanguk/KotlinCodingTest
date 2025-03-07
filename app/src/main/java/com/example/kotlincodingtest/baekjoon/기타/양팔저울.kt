package com.example.kotlincodingtest.baekjoon.기타

import java.io.*
import kotlin.math.abs

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val weights = readLine().split(' ').map{it.toInt()}

    var l = weights[0]
    var r = weights[1]

    for (i in 2 until n) {
        if (l <= r) {
            l += weights[i]
        } else {
            r += weights[i]
        }
    }

    var diff = abs(l -r)
    var ans = 0

    val plusW = intArrayOf(100, 50, 20, 10, 5, 2, 1)

    for (w in plusW) {
        if (diff == 0) {
            break
        }

        ans += diff / w
        diff %= w
    }
    
    println(ans)
}
