package com.example.kotlincodingtest.baekjoon.단계별.집합과_맵

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())){
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val notListenSet = mutableSetOf<String>()
    val notSeeSet = mutableSetOf<String>()

    for (i in 1..N) {
        notListenSet.add(readLine())
    }

    for (i in 1..M) {
        notSeeSet.add(readLine())
    }

    val notListenAndSeeSet = notListenSet.intersect(notSeeSet)

    println(notListenAndSeeSet.size)
    notListenAndSeeSet.sorted().forEach {
        println(it)
    }
}