package com.example.kotlincodingtest.baekjoon.단계별.스택_큐_덱

import java.io.BufferedReader
import java.util.ArrayDeque
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val d = ArrayDeque<Pair<Int, Int>>()
    val st = StringTokenizer(readLine())

    for (i in 1..N) {
        d.add(Pair(i, st.nextToken().toInt()))
    }

    var move = 0
    for (i in 1..N) {
        if (move >= 0) {
            for (j in 1 until move) {
                d.add(d.removeFirst())
            }
        } else {
            for (j in 1 .. move * (-1)) {
                d.addFirst(d.removeLast())
            }
        }
        move = d.first.second
        print("${d.removeFirst().first} ")
    }

}