package com.example.kotlincodingtest.baekjoon.반복

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {

    var st = StringTokenizer(readLine())
    var A: Int = st.nextToken().toInt()
    var B: Int = st.nextToken().toInt()

    while(true) {
        if (A == 0 && B == 0) {
            break
        }
        println(A + B)
        st = StringTokenizer(readLine())
        A = st.nextToken().toInt()
        B = st.nextToken().toInt()
    }

}