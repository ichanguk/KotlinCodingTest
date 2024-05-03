package com.example.kotlincodingtest.baekjoon.단계별.재귀

import java.io.BufferedReader
import java.io.BufferedWriter

private val bw = BufferedWriter(System.out.bufferedWriter())
fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()

    println(Math.pow(2.0, N.toDouble()).toInt() - 1)
    hanoi(N, 1, 3)
    bw.flush()
    bw.close()
}

fun hanoi(n: Int, ori: Int, des: Int) {
    if (n == 1) {
        bw.write("$ori $des\n")
        return
    }
    hanoi(n - 1, ori, 6 - des - ori)
    hanoi(1, ori, des)
    hanoi(n - 1, 6 - des - ori, des)
}