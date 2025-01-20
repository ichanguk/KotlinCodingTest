package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val trophy = IntArray(n) { 0 }
    repeat(n) {
        trophy[it] = readLine().toInt()
    }

    val l = calculateCanSee(trophy)
    val r = calculateCanSee(trophy.reversed().toIntArray())

    println(l)
    println(r)
}

private fun calculateCanSee(trophy: IntArray): Int {
    var ans = 0
    var maxH = 0

    for (h in trophy) {
        if (h > maxH) {
            maxH = h
            ans++
        }
    }
    return ans
}