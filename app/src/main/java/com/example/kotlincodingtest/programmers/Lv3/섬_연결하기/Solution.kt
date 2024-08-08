package com.example.kotlincodingtest.programmers.Lv3.섬_연결하기

import java.util.PriorityQueue

class Solution {
    var answer = Integer.MAX_VALUE

    fun solution(n: Int, costs: Array<IntArray>): Int {
        val costList = MutableList(n) {mutableListOf<Pair<Int, Int>>()}
        costs.forEach {
            costList[it[0]].add(Pair(it[1], it[2]))
            costList[it[1]].add(Pair(it[0], it[2]))
        }
        for (i in 0 until n) {
            bfs(i, costList)
        }
        return answer
    }

    fun bfs(s: Int, costList: MutableList<MutableList<Pair<Int, Int>>>) {
        val q = PriorityQueue<Pair<Int, Int>>(compareBy{it.second})
        val isVisit = MutableList(costList.size){false}
        var cnt = 0
        var sum = 0
        q.add(Pair(s, 0))

        while (q.isNotEmpty()) {
            val cur = q.remove()
            if (isVisit[cur.first]) {
                continue
            }
            isVisit[cur.first] = true
            cnt++
            sum += cur.second
            if (cnt == costList.size) {
                if (sum < answer) {
                    answer = sum
                    break
                }
            }

            for (cost in costList[cur.first]) {
                q.add(Pair(cost.first, cost.second))
            }
        }
    }
}
