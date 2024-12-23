package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val AGCTMap = mutableMapOf('A' to 0, 'G' to 1, 'C' to 2, 'T' to 3)
    val AGCTTable = arrayOf(
        charArrayOf('A','C', 'A', 'G'),
        charArrayOf('C', 'G', 'T', 'A'),
        charArrayOf('A', 'T', 'C', 'G'),
        charArrayOf('G', 'A', 'G', 'T')
    )

    var sb = StringBuilder(readLine())

    var DNA1: Int
    var DNA2: Int
    repeat(n - 1) {
        DNA1 = AGCTMap[sb[n - it - 2]]!!
        DNA2 = AGCTMap[sb[n - it - 1]]!!

        sb = sb.delete(sb.length - 2, sb.length).append(AGCTTable[DNA1][DNA2])
    }

    println(sb.toString())
}