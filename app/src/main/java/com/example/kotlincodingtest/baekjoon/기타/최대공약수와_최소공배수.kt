package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var (N, M) = readLine().split(' ').map { it.toInt() }

    if (M > N) {
        N = M.also { M = N }
    }

    val GCD = gcd(N, M)
    println(GCD)
    println(N * M / GCD)
}

private fun gcd(a: Int, b: Int): Int {
    var A = a
    var B = b
    var r = 0
    while (B != 0) {
        r = A % B
        A = B
        B = r
    }
    return A
}
