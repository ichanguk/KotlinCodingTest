package com.example.kotlincodingtest.baekjoon.기타

import java.io.*
import java.util.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    val startNote = st.nextToken().toInt()

    if (startNote == 1) {
        for (i in 2..8) {
            if (st.nextToken().toInt() != i) {
                println("mixed")
                return
            }
        }
        println("ascending")
    } else if (startNote == 8) {
        for (i in 2..8) {
            if (st.nextToken().toInt() != (9 - i)) {
                println("mixed")
                return
            }
        }
        println("descending")
    } else {
        println("mixed")
    }
}