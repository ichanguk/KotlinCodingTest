package com.example.kotlincodingtest.baekjoon.단계별.심화2

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val members = mutableSetOf<String>()

    var input = ""
    var res = 0
    for (i in 1..N) {
        input = readLine()
        if (input.equals("ENTER")) {
            members.clear()
        } else {
            if (!members.contains(input)) {
                members.add(input)
                res++
            }
        }
    }
    println(res)
}