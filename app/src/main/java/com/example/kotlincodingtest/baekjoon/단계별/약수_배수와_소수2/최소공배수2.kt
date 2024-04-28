package com.example.kotlincodingtest.baekjoon.단계별.약수_배수와_소수2

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var (A, B) = readLine().split(' ').map { it.toLong() }
    if (B > A) {
        A = B.also { B = A }
    }
    println((A * B) / gcd(A, B))
}

fun gcd(a: Long, b: Long): Long {
    var r = 0L
    var A = a
    var B = b
    while (B != 0L) {
        r = A % B
        A = B
        B = r
    }
    return A
}

