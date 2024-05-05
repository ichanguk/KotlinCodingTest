package com.example.kotlincodingtest.baekjoon.단계별.백트래킹

import java.io.BufferedReader
import kotlin.math.abs

private var N = 0
private var s = mutableListOf(mutableListOf<Int>())
private var sTeam = mutableListOf<Int>()
private var lTeam = mutableListOf<Boolean>()
private var res = mutableSetOf<Int>()
private var isVisit = mutableListOf<Boolean>()

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    N = readLine().toInt()
    s = MutableList(N) { MutableList<Int>(N) { 0 } }

    for (i in 0 until N) {
        s[i] = readLine().split(' ').map { it.toInt() }.toMutableList()
    }
    isVisit = MutableList<Boolean>(N) { false }
    startLink(0)
    println(res.min())
}

fun startLink(startIdx:Int) {
    if (sTeam.size == N / 2) {
        lTeam = MutableList<Boolean>(N) { true }
        var sSum = 0
        var lSum = 0
        for (i in sTeam.indices) {
            lTeam[sTeam[i]] = false
            for (j in sTeam.indices) {
                if (i == j) {
                    continue
                }
                sSum += s[sTeam[i]][sTeam[j]]
            }
        }
        for (i in lTeam.indices) {
            for (j in lTeam.indices) {
                if (i == j) {
                    continue
                }
                if (lTeam[i] && lTeam[j]) {
                    lSum += s[i][j]
                }
            }
        }
        res.add(abs(sSum - lSum))
        return
    }

    for (i in startIdx until N) {
        sTeam.add(i)
        startLink(i + 1)
        sTeam.remove(i)
    }

}

