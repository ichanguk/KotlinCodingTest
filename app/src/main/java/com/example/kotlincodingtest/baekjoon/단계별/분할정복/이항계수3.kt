package com.example.kotlincodingtest.baekjoon.단계별.분할정복

import java.io.BufferedReader

private val DIV = 1_000_000_007

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, K) = readLine().split(' ').map { it.toLong() }

    println(binomial(N, K))
}

fun binomial(n: Long, k: Long): Long {
    val K = if (k > n / 2) n - k else k

    if (K == 1L || n - K == 1L) {
        return n
    }
    if (K == 0L || n == K) {
        return 1L
    }

    var a = 1L
    var b = 1L
    var ans = 0L

    for (i in n downTo (n - K + 1)) {
        a = (a * i) % DIV
    }
    for (i in 1..K) {
        b = (b * i) % DIV
    }
    ans = a % DIV * power(b, (DIV - 2).toLong()) % DIV % DIV
    return ans
}

fun power(a: Long, b: Long) :Long{
    if (b == 1L) {
        return a % DIV
    }
    val divRes = power(a, b / 2)

    if (b % 2 == 1L) {
        return (divRes * divRes % DIV) * a % DIV
    } else {
        return divRes * divRes % DIV
    }
}