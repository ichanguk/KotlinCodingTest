package com.example.kotlincodingtest.baekjoon.단계별.약수_배수와_소수2

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var (A, B) = readLine().split(' ').map { it.toInt() }
    var (C, D) = readLine().split(' ').map { it.toInt() }

    val denominator = lcm(B, D)
    val numerator = A * (denominator / B) + C * (denominator / D)

    val divider = gcd(numerator, denominator)

    println("${numerator / divider} ${denominator / divider}")

}

fun lcm(a: Int, b: Int): Int {
    return (a * b) / gcd(a, b)
}

private fun gcd(a: Int, b: Int): Int {
    var r = 0
    var A = Math.max(a, b)
    var B = Math.min(a, b)
    while (B != 0) {
        r = A % B
        A = B
        B = r
    }
    return A
}