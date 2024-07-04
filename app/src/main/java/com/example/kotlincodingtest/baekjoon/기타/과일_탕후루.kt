package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val fruits = readLine().split(' ').map { it.toInt() }
    val fruitTypeList = MutableList(10) { 0 }

    var low = 0
    var cnt = 0
    var ans = 0

    for (high in 0 until N) {
        fruitTypeList[fruits[high]]++
        if (fruitTypeList[fruits[high]] == 1) {
            cnt++
        }

        while (cnt > 2) {
            fruitTypeList[fruits[low]]--
            if (fruitTypeList[fruits[low]] == 0) {
                cnt--
            }
            low++
        }

        ans = maxOf(ans, high - low + 1)
    }

    println(ans)
}

