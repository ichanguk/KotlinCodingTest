package com.example.kotlincodingtest.baekjoon.단계별.분할정복

import java.io.BufferedReader

private var nums = mutableListOf(listOf(0))
private var minusOneCnt = 0
private var zeroCnt = 0
private var oneCnt = 0

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val s = readLine().toInt()
    nums = MutableList(s) { List(s) { 0 } }
    for (i in 0 until s) {
        nums[i] = readLine().split(' ').map { it.toInt() }
    }
    countPaper(0, 0, s)
    println(minusOneCnt)
    println(zeroCnt)
    println(oneCnt)
}

fun countPaper(x: Int, y: Int, size: Int) {
    val num = nums[x][y]
    var flag = true
    loop@for (i in x until (x + size)) {
        for (j in y until (y + size)) {
            if (nums[i][j] != num) {
                flag = false
                break@loop
            }
        }
    }
    if (flag) {
        when (num) {
            1 -> oneCnt++
            0 -> zeroCnt++
            else -> minusOneCnt++
        }
        return
    }

    val ns = size / 3
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            countPaper(x + i * ns, y + j * ns, ns)
        }
    }
}

