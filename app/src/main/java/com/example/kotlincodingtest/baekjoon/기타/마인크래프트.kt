package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer
import kotlin.math.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M, B) = readLine().split(' ').map { it.toInt() }
    val houseSite = MutableList(N) { List(M) { 0 } }

    for (i in 0 until N) {
        houseSite[i] = readLine().split(' ').map { it.toInt() }
    }

    var minT = 99999999
    var resH = 0
    var t:Int
    var b:Int
    for (h in 0..256) {
        b = B
        t = 0
        for (i in 0 until N) {
            for (j in 0 until M) {
                val diff = houseSite[i][j] - h
                if (houseSite[i][j] > h) {
                    b += diff
                    t += diff * 2
                } else if (houseSite[i][j] < h) {
                    b += diff
                    t += abs(diff)
                }
            }
        }
        if (b < 0) {
            break
        }
        if (t <= minT) {
            minT = t
            resH = h
        }
    }

    val bw = BufferedWriter(System.out.bufferedWriter())
    bw.write("$minT $resH")
    bw.flush()
    bw.close()
}