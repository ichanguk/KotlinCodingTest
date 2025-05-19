package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val scores = readLine().split(' ').map { it.toInt() }
    val myScore = readLine().toInt()

    when (scores.indexOf(myScore)) {
        in 0..4 -> {
           println("A+")
        }
        in 5..14 -> {
            println("A0")
        }
        in 15..29 -> {
            println("B+")
        }
        in 30..34 -> {
            println("B0")
        }
        in 35..44 -> {
            println("C+")
        }
        in 45..47 -> {
            println("C0")
        }
        else -> {
            println("F")
        }
    }
}