package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader

private val INF = 1000

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val dist = MutableList(N) { MutableList(N) { INF } }
    val linkList = MutableList(N) { listOf<Int>() }
    for (i in 0 until N) {
        linkList[i] = readLine().split(' ').map { it.toInt() }
        linkList[i].forEachIndexed { j, v ->
            if (v == 1) {
                dist[i][j] = 1
            }
        }
    }

    for (k in 0 until N) {
        for (i in 0 until N) {
            for (j in 0 until N) {
                dist[i][j] = minOf(dist[i][j], dist[i][k] + dist[k][j])
            }
        }
    }
    dist.forEach {
        it.forEach {
            if (it == 1000) {
                print("0 ")
            } else {
                print("1 ")
            }
        }
        println()
    }
}