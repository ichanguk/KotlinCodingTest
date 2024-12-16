package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val sums = IntArray(n) { 0 }
    
    repeat(n) {
        sums[it] = readLine().toInt()
    }
    
    var prevNum = calA(sums)

    println(prevNum)
    for (i in 0 until (n - 1)) {
        prevNum = sums[i] - prevNum
        println(prevNum)
    }
}

fun calA(sums: IntArray): Int {
    var cur = sums[sums.size - 1]
    for (i in (sums.size - 2) downTo 0) {
        if (i % 2 == 0) {
            cur += sums[i]
        } else {
            cur -= sums[i]
        }
    }

    return cur / 2
}

