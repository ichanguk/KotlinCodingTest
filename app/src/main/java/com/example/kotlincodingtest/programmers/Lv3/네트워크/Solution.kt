package com.example.kotlincodingtest.programmers.Lv3.네트워크

class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        val isVisit = MutableList(n){ false }

        val q = ArrayDeque<Int>()
        for (i in isVisit.indices) {
            if (!isVisit[i]) {
                q.addLast(i)
                answer++
                while (q.isNotEmpty()) {
                    val cur = q.removeFirst()
                    isVisit[cur] = true
                    for (x in 0 until n) {
                        if (!isVisit[x] && computers[cur][x] == 1) {
                            q.addLast(x)
                        }
                    }
                }
            }
        }

        return answer
    }
}