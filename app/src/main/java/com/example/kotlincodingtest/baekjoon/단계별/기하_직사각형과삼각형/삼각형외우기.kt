package com.example.kotlincodingtest.baekjoon.단계별.기하_직사각형과삼각형

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val A = readLine().toInt()
    val B = readLine().toInt()
    val C = readLine().toInt()

    val sum = A + B + C

    if (sum != 180) {
        println("Error")
    } else if (A == B && A == C) {
        println("Equilateral")
    } else if (A == B || A == C || B == C) {
        println("Isosceles")
    } else {
        println("Scalene")
    }
}