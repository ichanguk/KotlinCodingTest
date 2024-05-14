package com.example.kotlincodingtest.baekjoon.단계별.그리디_알고리즘

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val inputString = readLine()
    val operands = inputString.split("[+-]".toRegex()).map { it.toInt() }
    val operators = inputString.split("[0-9]+".toRegex()).toMutableList()
    operators.removeFirst()
    operators.removeLast()

    var res = operands[0]
    var flag = false
    for (i in operators.indices) {
        if (flag) {
            res -= operands[i + 1]
        } else {
            if (operators[i] == "-") {
                flag = true
                res -= operands[i + 1]
            } else {
                res += operands[i + 1]
            }
        }
    }
    println(res)
}