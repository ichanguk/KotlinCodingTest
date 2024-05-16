package com.example.kotlincodingtest.baekjoon.단계별.분할정복

import java.io.BufferedReader

val s = mutableSetOf<Long>()

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (A, B, C) = readLine().split(' ').map { it.toLong() }

    println(multiply(A, B, C))
}

fun multiply(a: Long, b: Long, c: Long): Long {
    if (b == 1L) {
        return a % c
    }
    val divideRes = multiply(a, b / 2, c)
    if (b % 2 == 1L) {
        return (divideRes * divideRes % c) * a % c
    } else {
        return divideRes * divideRes % c
    }
}