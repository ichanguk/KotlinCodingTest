package com.example.kotlincodingtest.baekjoon.단계별.집합과_맵

import java.io.BufferedReader
fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val membersInOffice = mutableSetOf<String>()

    for (i in 1..N) {
        val (name, enterOrLeave) = readLine().split(' ')
        if (enterOrLeave == "enter") {
            membersInOffice.add(name)
        } else {
            membersInOffice.remove(name)
        }
    }

    membersInOffice.sortedDescending().forEach {
        println(it)
    }
}