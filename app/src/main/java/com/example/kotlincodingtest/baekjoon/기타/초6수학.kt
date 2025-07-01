package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n) {
        var (a, b) = readLine().split(' ').map { it.toInt() }

        if (b > a) {
            a = b.also { b = a }
        }

        val gcdAns = gcd(a, b)

        println("${a * b / gcdAns} $gcdAns")
    }
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
