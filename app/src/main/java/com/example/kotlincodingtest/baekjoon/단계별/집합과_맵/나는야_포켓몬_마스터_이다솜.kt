package com.example.kotlincodingtest.baekjoon.단계별.집합과_맵

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val poketmonMapIndexKey = mutableMapOf<Int, String>()
    val poketmonMapNameKey = mutableMapOf<String, Int>()

    var name: String? = null
    for (i in 1..N) {
        name = readLine()
        poketmonMapIndexKey[i] = name
        poketmonMapNameKey[name] = i
    }

    var key: String? = null
    for (i in 1..M) {
        key = readLine()
        if (key[0].isDigit()) {
            println(poketmonMapIndexKey[key.toInt()])
        } else {
            println(poketmonMapNameKey[key])
        }
    }
}