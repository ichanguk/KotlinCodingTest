package com.example.kotlincodingtest.baekjoon.단계별.조합론

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()
    for (i in 1..T) {
        val (N, M) = readLine().split(' ').map { it.toInt() }
        println(combi(M, N))
    }
}

private fun combi(m: Int, n: Int): Long {
    var res = 1L
    val N = if (n > m / 2) m - n else n
    for (i in (m - N + 1)..m) {
        res *= i
    }
    return res / fact(N)
}


private fun fact(n: Int): Long {
    var res = 1L
    for (i in 1..n) {
        res *= i
    }
    return res
}
