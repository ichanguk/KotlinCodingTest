package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val res = IntArray(n) { 0 }
    
    repeat(n) {
        if (readLine() == "D") {
            res[it] = 1
        }
    }
    
    var dScore = 0
    var pScore = 0
    for (r in res) {
        if (r == 1) {
            dScore++
        } else {
            pScore++
        }

        if (dScore >= pScore + 2 || pScore >= dScore + 2) {
            break
        }
    }

    println("$dScore:$pScore")
}