package com.example.kotlincodingtest.baekjoon.새싹.배열

import java.util.*
import java.io.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()

    val basket = MutableList<Int>(N) { 0 }

    var startIndex: Int? = null
    var endIndex: Int? = null
    var num: Int? = null

    for (i in 1..M) {
        st = StringTokenizer(readLine())
        startIndex = st.nextToken().toInt() - 1
        endIndex = st.nextToken().toInt() - 1
        num = st.nextToken().toInt()

        for (j in startIndex .. endIndex) {
            basket.set(j, num)
        }
    }

    basket.forEach {
        print("$it ")
    }
}