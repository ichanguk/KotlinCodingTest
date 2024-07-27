package com.example.kotlincodingtest.baekjoon.class4

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val numList = readLine().split(' ').map { it.toInt() }.toSet().toList().sorted()

    combi(M, 0, numList, arrayOf())

}

private fun combi(m: Int, start:Int, numList: List<Int>, cur: Array<Int>) {
    if (cur.size == m) {
        println(cur.joinToString(" "))
        return
    }

    for (i in start until numList.size) {
        combi(m, i, numList, cur + numList[i])
    }
}