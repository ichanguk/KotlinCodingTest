package com.example.kotlincodingtest.baekjoon.단계별.기하_직사각형과삼각형

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val END_INPUT = "0 0 0"
    var inputString = readLine()
    var st: StringTokenizer? = null

    val lengths = mutableListOf(0, 0, 0)
    var maxLength = 0
    var maxLengthIdx = 0
    var otherSum = 0

    while (inputString != END_INPUT) {
        st = StringTokenizer(inputString)

        maxLength = 0
        otherSum = 0

        for (i in 0..2) {
            lengths[i] = st.nextToken().toInt()
            if (lengths[i] > maxLength) {
                maxLength = lengths[i]
                maxLengthIdx = i
            }
        }

        for (i in 0..2) {
            if (i == maxLengthIdx) {
                continue
            }
            otherSum += lengths[i]
        }

        if (maxLength >= otherSum) {
            println("Invalid")
        } else if (lengths[0] == lengths[1] && lengths[1] == lengths[2]) {
            println("Equilateral")
        } else if (lengths[0] == lengths[1] || lengths[0] == lengths[2] || lengths[1] == lengths[2]) {
            println("Isosceles")
        } else {
            println("Scalene")
        }
        inputString = readLine()
    }

}