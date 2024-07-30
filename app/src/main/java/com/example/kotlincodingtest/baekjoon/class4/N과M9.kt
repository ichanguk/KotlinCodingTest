package com.example.kotlincodingtest.baekjoon.class4

import java.io.BufferedReader

private lateinit var isVisit:MutableList<Boolean>
private val result = mutableSetOf<List<Int>>()

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val numList = readLine().split(' ').map { it.toInt() }.toList().sorted()

    isVisit = MutableList(N){false}

    dfs(numList, M, listOf<Int>())
    result.forEach {
        println(it.joinToString(" "))
    }
}

fun dfs(numList: List<Int>, m: Int, cur: List<Int>) {
    if (cur.size == m) {
        result.add(cur)
        return
    }

    for (i in numList.indices) {
        if(!isVisit[i]) {
            isVisit[i] = true
            dfs(numList, m, cur + numList[i])

            isVisit[i] = false
        }
    }
}

