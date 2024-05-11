package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.io.BufferedWriter

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    var res = 0L
    val inputString = readLine()
    var r:Double
    for (i in 0 until N) {
        r = 1.0
        for (j in 1..i) {
            r *= 31
            r %= 1234567891
        }
        res += (r * (inputString[i] - 'a' + 1)).toLong()
        res %= 1234567891
    }
    val bw = BufferedWriter(System.out.bufferedWriter())
    bw.write("$res\n")
    bw.flush()
    bw.close()
}