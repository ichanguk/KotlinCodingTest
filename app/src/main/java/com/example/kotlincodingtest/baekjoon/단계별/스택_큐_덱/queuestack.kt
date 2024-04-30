package com.example.kotlincodingtest.baekjoon.단계별.스택_큐_덱

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.ArrayDeque
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()

    var st = StringTokenizer(readLine())
    var queueIdx = mutableListOf<Int>()

    for (i in 0 until N) {
        if (st.nextToken() == "0") {
            queueIdx.add(i)
        }
    }

    st = StringTokenizer(readLine())
    var queueStack = ArrayDeque<Int>()
    var valList = MutableList<Int>(N) { 0 }
    for (i in 0 until N) {
        valList[i] = st.nextToken().toInt()
    }

    queueIdx.forEach {
        queueStack.add(valList[it])
    }
    val M = readLine().toInt()
    st = StringTokenizer(readLine())

    val bw = BufferedWriter(System.out.bufferedWriter())
    for (i in 1..M) {
        queueStack.addFirst(st.nextToken().toInt())
        bw.write("${queueStack.removeLast()} ")
    }
    bw.flush()
    bw.close()
}