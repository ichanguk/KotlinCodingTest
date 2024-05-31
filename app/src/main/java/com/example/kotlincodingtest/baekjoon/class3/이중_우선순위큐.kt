package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader
import java.util.PriorityQueue

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    repeat(readLine().toInt()) {
        val N = readLine().toInt()
        val minQ = PriorityQueue<Int>()
        val maxQ = PriorityQueue<Int>(compareByDescending { it })
        var cnt = mutableMapOf<Int, Int>()
        repeat(N) {
            val cmd = readLine().split(' ')
            if (cmd[0] == "I") {
                minQ.add(cmd[1].toInt())
                maxQ.add(cmd[1].toInt())
                cnt[cmd[1].toInt()] = cnt.getOrDefault(cmd[1].toInt(), 0) + 1
            } else {
                if (cmd[1] == "1") {
                    if (maxQ.isNotEmpty()) {
                        cnt[maxQ.first()] = cnt[maxQ.first()]!! - 1
                        maxQ.remove()
                    }
                } else {
                    if (minQ.isNotEmpty()) {
                        cnt[minQ.first()] = cnt[minQ.first()]!! - 1
                        minQ.remove()
                    }
                }
                while (minQ.isNotEmpty() && cnt[minQ.first()] == 0) {
                    minQ.remove()
                }
                while (maxQ.isNotEmpty() && cnt[maxQ.first()] == 0) {
                    maxQ.remove()
                }
            }
        }
        if (maxQ.isEmpty() || minQ.isEmpty()) {
            println("EMPTY")
        } else {
            println("${maxQ.first()} ${minQ.first()}")
        }
    }
}