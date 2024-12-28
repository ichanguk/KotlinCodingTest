package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, m) = readLine().split(' ')

    var a = if (n.length >= m.length) n else m
    var b = if (n.length >= m.length) m else n

    a = a.reversed()
    b = b.reversed()

    var flag = 0

    val sb = StringBuilder()
    for (i in 0 until b.length) {
        when (flag + (a[i] - '0') + (b[i] - '0')) {
            0 -> sb.append(0)
            1 -> {
                sb.append(1)
                flag = 0
            }
            2 -> {
                sb.append(0)
                flag = 1
            }
            3 -> {
                sb.append(1)
            }
        }
    }

    for (i in b.length until a.length) {
        when (flag + (a[i] - '0')) {
            0 -> sb.append(0)
            1 -> {
                sb.append(1)
                flag = 0
            }
            2 -> {
                sb.append(0)
            }
        }
    }


    if (flag == 1) {
        sb.append(1)
    }

    while (sb.isNotEmpty() && sb.last() == '0') {
        sb.delete(sb.length - 1, sb.length)
    }

    if (sb.isEmpty()) {
        println(0)
    } else {
        println(sb.reverse().toString())
    }
}