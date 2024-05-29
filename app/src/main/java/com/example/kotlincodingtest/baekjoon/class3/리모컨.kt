package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader
import kotlin.math.abs

private val brokenBtn = MutableList(10) { false }

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val M = readLine().toInt()

    val NMinus100 = abs(N - 100)
    if (M == 0) {
        println(minOf(NMinus100, N.toString().length))
        return@with
    }

    readLine().split(' ').map { it.toInt() }.forEach {
        brokenBtn[it] = true
    }
    var cnt = 0
    var resUp = N
    var resDown = N
    while (true) {

        if (cnt + resUp.toString().length >= NMinus100 && cnt + resDown.toString().length >= NMinus100) {
            println(NMinus100)
            break
        }

        if (resDown >= 0 && canMove(resDown)) {
            println(cnt + resDown.toString().length)
            break
        }

        if (canMove(resUp)) {
            println(cnt + resUp.toString().length)
            break
        }

        resUp++
        resDown--
        cnt++
    }
}

fun canMove(n: Int): Boolean {
    n.toString().forEach {
        if (brokenBtn[it - '0']) {
            return false
        }
    }
    return true
}
