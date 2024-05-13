package com.example.kotlincodingtest.baekjoon.단계별.누적합

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.min

private var nums: MutableList<String> = MutableList(2) { "" }
private var N = 0
private var M = 0
private var K = 0

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    N = st.nextToken().toInt()
    M = st.nextToken().toInt()
    K = st.nextToken().toInt()

    nums = MutableList(N) { "" }
    for (i in 0 until N) {
        nums[i] = readLine()
    }
    println(min(solve('B'), solve('W')))

}

fun solve(s: Char): Int {
    val sumList = MutableList(N + 1) { MutableList(M + 1) { 0 } }
    var flag = 0
    for (i in 0 until N) {
        for (j in 0 until M) {
            flag = 0
            if ((i + j) % 2 == 0) {
                if (nums[i][j] != s) {
                    flag = 1
                }
            } else {
                if (nums[i][j] == s) {
                    flag = 1
                }
            }
            sumList[i + 1][j + 1] =
                sumList[i + 1][j] + sumList[i][j + 1] - sumList[i][j] + flag
        }
    }
    var res = Int.MAX_VALUE
    for (i in K..N) {
        for (j in K..M) {
            res = min(sumList[i][j] - sumList[i - K][j] - sumList[i][j - K] + sumList[i - K][j - K], res)
        }
    }
    return res
}