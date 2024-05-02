package com.example.kotlincodingtest.baekjoon.단계별.심화2

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val dancers = mutableSetOf<String>("ChongChong")

    for (i in 1..N) {
        val (name1, name2) = readLine().split(' ')
        if (dancers.contains(name1)) {
            dancers.add(name2)
        } else if (dancers.contains(name2)) {
            dancers.add(name1)
        }
    }
    println(dancers.size)
}