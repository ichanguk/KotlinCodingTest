package com.example.kotlincodingtest.baekjoon.단계별.재귀

import java.io.BufferedReader
import java.io.BufferedWriter

private val bw = BufferedWriter(System.out.bufferedWriter())

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val starList = MutableList(N){MutableList<Char>(N){' '}}
    printStar(N, starList, 0, 0)
    starList.forEach {
        it.forEach {
            bw.write(it.toString())
        }
        bw.newLine()
    }
    bw.flush()
    bw.close()
}

fun printStar(n: Int, starList:MutableList<MutableList<Char>>, startI:Int, startJ:Int) {
    if (n == 3) {

        for (i in startI until startI + 3) {
            for (j in startJ until startJ + 3) {
                if (i == startI + 1 && j == startJ + 1) {
                    continue
                }
                starList[i][j] = '*'
            }
        }
        return
    }
    for (i in 0..2) {
        for (j in 0..2) {
            if (i == 1 && j == 1) {
                continue
            }
            printStar(n / 3, starList, startI + i * (n / 3), startJ + j * (n / 3))
        }
    }
}
