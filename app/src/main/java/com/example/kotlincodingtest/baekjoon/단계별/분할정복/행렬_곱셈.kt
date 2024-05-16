package com.example.kotlincodingtest.baekjoon.단계별.분할정복

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val matA = MutableList(N) { List(M) { 0 } }

    for (i in 0 until N) {
        matA[i] = readLine().split(' ').map { it.toInt() }
    }

    val (m, K) = readLine().split(' ').map { it.toInt() }
    val matB = MutableList(m) { List(K) { 0 } }
    for (i in 0 until m) {
        matB[i] = readLine().split(' ').map { it.toInt() }
    }

    val matC = MutableList(N) { MutableList(K) { 0 } }

    for (i in 0 until N) {
        for (j in 0 until K) {
            var res = 0
            for (k in 0 until M) {
                res += matA[i][k] * matB[k][j]
            }
            matC[i][j] = res
        }
    }

    matC.forEach {
        it.forEach {
            print("$it ")
        }
        println()
    }
}