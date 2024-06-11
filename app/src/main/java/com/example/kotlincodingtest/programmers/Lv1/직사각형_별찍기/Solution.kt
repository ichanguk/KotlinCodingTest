package com.example.kotlincodingtest.programmers.Lv1.직사각형_별찍기

import java.io.*

fun main(args: Array<String>) = with(BufferedReader(System.`in`.bufferedReader())) {
    val (a, b) = readLine().split(' ').map { it.toInt() }
    val bw = BufferedWriter(System.`out`.bufferedWriter())

    val sb = StringBuilder()
    repeat(a) {
        sb.append('*')
    }
    repeat(b) {
        bw.write(sb.toString() + '\n')
    }
    bw.flush()
    bw.close()
}