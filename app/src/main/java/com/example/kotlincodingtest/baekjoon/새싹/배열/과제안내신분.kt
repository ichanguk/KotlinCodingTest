package com.example.kotlincodingtest.baekjoon.새싹.배열

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())){
    val attendance = Array<Boolean>(30, {true})

    for (i in 1..28) {
        attendance.set(readLine().toInt() - 1, false)
    }

//    attendance.forEachIndexed { i, v ->
//        if (v) {
//            println(i + 1)
//        }
//    }

    println(attendance.indexOfFirst { it == true } + 1)
    println(attendance.indexOfLast { it == true } + 1)

}