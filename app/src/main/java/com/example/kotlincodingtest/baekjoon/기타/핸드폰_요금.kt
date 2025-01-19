package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val callTime = readLine().split(' ').map { it.toInt() }
    val yBill = calBill(callTime, 30, 10)
    val mBill = calBill(callTime, 60, 15)

    if (yBill < mBill) {
        println("Y $yBill")
    } else if (yBill == mBill) {
        println("Y M $yBill")
    } else {
        println("M $mBill")
    }

}

private fun calBill(callTime: List<Int>, time: Int, cost: Int): Int {
    var res = 0
    callTime.forEach {
        res += (it / time + 1) * cost
    }

    return res
}