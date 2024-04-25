package com.example.kotlincodingtest.baekjoon.단계별.기하_직사각형과삼각형

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    var minX: Int = 10000
    var minY: Int = 10000
    var maxX: Int = -10000
    var maxY: Int = -10000

    for (i in 1..N) {
        val (x, y) = readLine().split(' ').map { it.toInt() }
        if (x < minX) {
            minX = x
        }
        if (y < minY) {
            minY = y
        }
        if (x > maxX) {
            maxX = x
        }
        if (y > maxY) {
            maxY = y
        }
    }

    val area = (maxX - minX) * (maxY - minY)
    println(area)
}