package com.example.kotlincodingtest.baekjoon.단계별.약수_배수와_소수2

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T: Int = readLine().toInt()

    for (i in 1..T) {
        var (A, B) = readLine().split(' ').map { it.toInt() }
        var factorProduct = 1
        for (j in Math.min(A, B)downTo 2) {
            if (A % j == 0 && B % j == 0) {
                A /= j
                B /= j
                factorProduct *= j
            }
            if (A == 1 || B == 1) {
                break
            }
        }
        println(A * B * factorProduct)
    }
}