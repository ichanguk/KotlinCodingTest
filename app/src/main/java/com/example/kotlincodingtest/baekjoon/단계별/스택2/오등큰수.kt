package com.example.kotlincodingtest.baekjoon.단계별.스택2

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.Stack
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val st = StringTokenizer(readLine())
    val numList = IntArray(N) { 0 }
    val cntList = IntArray(1_000_001) { 0 }

    for (i in 0 until N) {
        numList[i] = st.nextToken().toInt()
        cntList[numList[i]]++
    }

    val s = Stack<Int>()
    val answers = IntArray(N) { -1 }

    s.push(0)

    for (i in 1 until N) {
        while (s.isNotEmpty() && cntList[numList[s.peek()]] < cntList[numList[i]]) {
            answers[s.pop()] = numList[i]
        }
        s.push(i)
    }

    val bw = BufferedWriter(System.out.bufferedWriter())
    answers.forEach {
        bw.write("$it ")
    }
    bw.newLine()
    bw.flush()
    bw.close()
}