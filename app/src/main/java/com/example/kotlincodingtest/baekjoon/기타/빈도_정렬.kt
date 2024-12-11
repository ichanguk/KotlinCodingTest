package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (n, c) = readLine().split(' ').map { it.toInt() }
    val map = mutableMapOf<Int, Pair<Int, Int>>()

    var idx = 0
    val input = readLine().split(' ').map { it.toInt() }

    input.forEach {
        if (map.containsKey(it)) {
            map[it] = Pair(map[it]!!.first, map[it]!!.second + 1)
        } else {
            map[it] = Pair(idx++, 1)
        }
    }

    map.toList().sortedWith(
        compareByDescending<Pair<Int, Pair<Int, Int>>> {
            it.second.second
        }.thenBy {
            it.second.first
        }
    ).forEach {
        val cur = it.first
        repeat(it.second.second) {
            print("$cur ")
        }
    }
}