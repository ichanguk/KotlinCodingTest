package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    repeat(readLine().toInt()) {
        var (A, B) = readLine().split(' ').map { it.toInt() }
        val isVisit = MutableList(10000) { false }

        val q = ArrayDeque<Pair<Int, String>>()
        q.addLast(Pair(A, String()))
        isVisit[A] = true

        while (q.isNotEmpty()) {
            val cur = q.removeFirst()

            if (cur.first == B) {
                println(cur.second)
                break
            }
            val nD = cur.first * 2 % 10000
            if (!isVisit[nD]) {
                q.addLast(Pair(nD, cur.second + 'D'))
                isVisit[nD] = true
            }
            val nS = if (cur.first == 0) 9999 else cur.first - 1
            if (!isVisit[nS]) {
                q.addLast(Pair(nS, cur.second + 'S'))
                isVisit[nS] = true
            }

            val nL = (cur.first * 10) % 10000 + cur.first / 1000
            if (!isVisit[nL]) {
                q.addLast(Pair(nL, cur.second + 'L'))
                isVisit[nL] = true
            }

            val nR = (cur.first % 10) * 1000 + cur.first / 10
            if (!isVisit[nR]) {
                q.addLast(Pair(nR, cur.second + 'R'))
                isVisit[nR] = true
            }
        }
    }
}