package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader
import java.io.BufferedWriter

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var cmd: String
    var N: Int
    var dq:ArrayDeque<Int>
    var flag:Boolean
    val bw = BufferedWriter(System.out.bufferedWriter())
    repeat(readLine().toInt()) {
        flag = true
        cmd = readLine()
        N = readLine().toInt()
        dq = ArrayDeque()
        if (N == 0) {
            readLine()
        } else {
            readLine().drop(1).dropLast(1).split(',').map { it.toInt() }.forEach {
                dq.addLast(it)
            }
        }
        var shouldReverse = false
        for (c in cmd) {
            if (c == 'R') {
                shouldReverse = !shouldReverse
            } else {
                if (dq.isNotEmpty()) {
                    if (shouldReverse) {
                        dq.removeLast()
                    } else {
                        dq.removeFirst()
                    }
                } else {
                    flag = false
                    break
                }
            }
        }
        if (flag) {
            if (shouldReverse) {
                dq.reverse()
            }
            bw.write(dq.toString().replace(" ", ""))
            bw.newLine()
        } else {
            bw.write("error\n")
        }
    }
    bw.flush()
    bw.close()
}