package com.example.kotlincodingtest.baekjoon.단계별.분할정복

import java.io.BufferedReader
import java.io.BufferedWriter

private val DIV = 1_000_000_007
private val fiboMap = mutableMapOf<Long, Long>()

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toLong()
    fiboMap[0] = 0
    fiboMap[1] = 1
    fiboMap[2] = 1

    val bw = BufferedWriter(System.out.bufferedWriter())
    bw.write("${fibo(n)}")
    bw.flush()
    bw.close()
}

fun fibo(n:Long):Long {
    if (fiboMap[n] != null) {
        return fiboMap[n]!!
    }
    var res:Long
    if (n % 2 == 0L) {
        res = (fibo(n / 2) * (fibo(n / 2 + 1) + fibo(n / 2 - 1))) % DIV
    } else {
        res = (fibo((n + 1) / 2) * fibo((n + 1) / 2)) % DIV + (fibo((n - 1) / 2) * fibo((n - 1) / 2)) % DIV
    }

    fiboMap[n] = res
    return res % DIV
}