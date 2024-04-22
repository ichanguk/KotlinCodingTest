package com.example.kotlincodingtest.baekjoon.새싹.빠른입출력

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    var st = StringTokenizer(readLine())
    var A: Int = st.nextToken().toInt()
    var B: Int = st.nextToken().toInt()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${A + B}")
    bw.newLine()
    for (i in 1 until N) {
        st = StringTokenizer(readLine())
        A = st.nextToken().toInt()
        B = st.nextToken().toInt()
        bw.write("${A + B}")
        bw.newLine()
    }
    bw.flush()
    bw.close()
}