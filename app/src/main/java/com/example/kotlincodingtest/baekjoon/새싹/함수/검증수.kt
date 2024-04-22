package com.example.kotlincodingtest.baekjoon.새싹.함수

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())){
    val nums = readLine().split(" ").map { it -> it.toDouble() }
    var sum: Int = 0

    nums.forEach {
        sum += Math.pow(it, 2.0).toInt()
    }
    println(sum % 10)

}