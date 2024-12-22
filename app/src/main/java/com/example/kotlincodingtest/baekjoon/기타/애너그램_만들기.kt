package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val a = readLine()
    val b = readLine()

    val arr = IntArray('z' - 'a' + 1) { 0 }
    a.forEach {
        arr[it - 'a']++
    }

    var ans = 0

    b.forEach {
        if (arr[it - 'a'] > 0) {
            arr[it - 'a']--
        } else {
            ans++
        }
    }

    println(ans + arr.sum())

}