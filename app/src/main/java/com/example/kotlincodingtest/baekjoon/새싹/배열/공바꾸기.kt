package com.example.kotlincodingtest.baekjoon.새싹.배열

import java.io.*
import java.util.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()
    val basket = MutableList<Int>(N) {0}

    basket.forEachIndexed { index, value ->
        basket.set(index, index + 1)
    }


    var index1: Int? = null
    var index2: Int? = null

    for (i in 1..M) {
        st = StringTokenizer(readLine())
        index1 = st.nextToken().toInt() - 1
        index2 = st.nextToken().toInt() - 1

        Collections.swap(basket, index1, index2)
    }

    basket.forEach {
        print("$it ")
    }
}