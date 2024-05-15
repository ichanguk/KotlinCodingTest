package com.example.kotlincodingtest.baekjoon.단계별.분할정복

import java.io.BufferedReader

private var m = mutableListOf("")
private val sb = StringBuilder()

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    m = MutableList(N) { "" }
    for (i in 0 until N) {
        m[i] = readLine()
    }

    quadTree(0, 0, N)
    println(sb.toString())
}

fun quadTree(x: Int, y: Int, size: Int) {
    val point = m[x][y]
    var flag = true
    loop@for (i in x until x + size) {
        for (j in y until y + size) {
            if(m[i][j] != point) {
                flag = false
                break@loop
            }
        }
    }
    if (flag) {
        if (point == '1') {
            sb.append('1')
        } else {
            sb.append('0')
        }
        return
    }

    val ns = size / 2

    sb.append('(')
    quadTree(x, y, ns)
    quadTree(x, y + ns, ns)
    quadTree(x + ns, y, ns)
    quadTree(x + ns, y + ns, ns)
    sb.append(')')

}

