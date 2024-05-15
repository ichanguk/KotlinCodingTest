package com.example.kotlincodingtest.baekjoon.단계별.분할정복

import java.io.BufferedReader

private var colorList:MutableList<List<Int>>? = null
private var whiteCnt = 0
private var blueCnt = 0

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    colorList = MutableList(N + 1) { MutableList(N + 1) { 0 } }
    for (i in 0 until N) {
        colorList!![i] = readLine().split(' ').map { it.toInt() }
    }
    makePaper(0, 0, N)
    println(whiteCnt)
    println(blueCnt)
}

fun makePaper(x: Int, y: Int, n: Int) {
    val color = colorList!![x][y]
    var flag = true
    loop@for (i in x until (x + n)) {
        for (j in y until (y + n)) {
            if(colorList!![i][j] != color) {
                flag = false
                break@loop
            }
        }
    }
    if (flag) {
        if (color == 1) {
            blueCnt++
        } else {
            whiteCnt++
        }
        return
    }

    val nextN = n / 2
    makePaper(x, y, nextN)
    makePaper(x + nextN, y, nextN)
    makePaper(x, y + nextN, nextN)
    makePaper(x + nextN, y + nextN, nextN)

}

