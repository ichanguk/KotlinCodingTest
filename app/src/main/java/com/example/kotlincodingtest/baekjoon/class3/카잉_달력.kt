package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    repeat(readLine().toInt()) {
        var (M, N, x, y) = readLine().split(' ').map { it.toInt() }
        val finalNum = lcm(M, N)
        var res = -1

        while (x <= finalNum && y <= finalNum) {
            if (x == y) {
                res = x
                break
            }
            if (x <= y) {
                x += M
            } else {
                y += N
            }
        }
        println(res)
    }
}

private fun lcm(m: Int, n: Int): Int {
    return m * n / gcd(m, n)
}

private fun gcd(m: Int, n: Int): Int {
    var a = if (m > n) m else n
    var b = if (m > n) n else m
    var r = 0
    while (b != 0) {
        r = a % b
        a = b
        b = r
    }
    return a
}
