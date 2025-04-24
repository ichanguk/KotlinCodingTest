package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val l = readLine().toInt()
    val n = readLine().toInt()
    val cakes = IntArray(l + 1) { 0 }
    val counts = IntArray(n + 1) { 0 }

    var maxCake = 0
    var maxCakeNum = 0
    var maxCount = 0
    var maxCountNum = 0

    repeat(n) {
        val (p, k) = readLine().split(' ').map { it.toInt() }
        if (k - p + 1 > maxCake) {
            maxCake = k - p + 1
            maxCakeNum = it + 1
        }

        for (i in p..k) {
            if (cakes[i] == 0) {
                cakes[i] = it + 1
                counts[it + 1]++
            }
        }

        if (counts[it + 1] > maxCount) {
            maxCount = counts[it + 1]
            maxCountNum = it + 1
        }
    }

    println(maxCakeNum)
    println(maxCountNum)

}