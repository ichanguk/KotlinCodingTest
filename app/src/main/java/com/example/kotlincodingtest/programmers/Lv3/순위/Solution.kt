package com.example.kotlincodingtest.programmers.Lv3.순위

class Solution {
    fun solution(n: Int, results: Array<IntArray>): Int {
        var answer = 0
        val g = MutableList(n + 1) { MutableList(n + 1) { 0 } }
        results.forEach {
            g[it[0]][it[1]] = 1
            g[it[1]][it[0]] = -1
        }

        for (k in 1..n) {
            for (i in 1..n) {
                for (j in 1..n) {
                    if (g[i][k] == 1 && g[k][j] == 1) {
                        g[i][j] = 1
                        g[j][i] = -1
                    }
                }
            }
        }

        g.drop(1).forEach {
            if (it.count { it == 0 } == 2) {
                answer++
            }
        }
        return answer
    }
}