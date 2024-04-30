package com.example.kotlincodingtest.baekjoon.단계별.스택_큐_덱

import java.io.BufferedReader
import java.util.Stack
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val st = StringTokenizer(readLine())
    val watingSpace = Stack<Int>()
    var curNum = 0
    for (i in 1..N) {
        val nextPerson = st.nextToken().toInt()
        if (nextPerson == curNum + 1) {
            curNum++
            while (!watingSpace.empty() && watingSpace.peek() == curNum + 1) {
                watingSpace.pop()
                curNum++
            }
        } else {
            watingSpace.push(nextPerson)
        }
    }
    if (curNum == N) {
        println("Nice")
    } else {
        println("Sad")
    }
}