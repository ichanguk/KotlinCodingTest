package com.example.kotlincodingtest.baekjoon.단계별.약수_배수와_소수

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var inputString = readLine()

    while (true) {
        val (num1, num2) = inputString.trim().split(' ').map { it.toInt() }
        if (num1 == 0 && num2 == 0) {
            break
        }
        if (num1 % num2 == 0) {
            println("multiple")
        } else if (num2 % num1 == 0) {
            println("factor")
        } else {
            println("neither")
        }

        inputString = readLine()
    }

}