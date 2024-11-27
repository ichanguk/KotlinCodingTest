package com.example.kotlincodingtest.programmers.Lv2.충돌위험_찾기

class Solution {
    fun solution(points: Array<IntArray>, routes: Array<IntArray>): Int {
        var answer: Int = 0
        var n = points.size
        var m = routes.size

        val robots = Array(m) { Pair(0, 0) }
        val cur = IntArray(m) { 0 }

        for (i in 0 until m) {
            val r = routes[i][0] - 1
            robots[i] = Pair(points[r][0], points[r][1])
        }

        var cnt = 0
        val isArrived = BooleanArray(m) { false }
        val isDone = BooleanArray(m) { false }


        while (cnt < m) {
            answer += countDanger(robots, isDone)
            for (i in 0 until m) {
                if (isDone[i]) {
                    continue
                } else if (isArrived[i]) {
                    isDone[i] = true
                    cnt++
                    continue
                }
                val np = points[routes[i][cur[i] + 1] - 1]
                if (robots[i].first > np[0]) {
                    robots[i] = Pair(robots[i].first - 1, robots[i].second)
                } else if (robots[i].first < np[0]) {
                    robots[i] = Pair(robots[i].first + 1, robots[i].second)
                } else if (robots[i].second > np[1]) {
                    robots[i] = Pair(robots[i].first, robots[i].second - 1)
                } else {
                    robots[i] = Pair(robots[i].first, robots[i].second + 1)
                }
                if (robots[i].first == np[0] && robots[i].second == np[1]) {
                    cur[i]++
                    if (cur[i] == routes[i].size - 1) {
                        isArrived[i] = true
                    }
                }
            }
        }


        return answer
    }

    private fun countDanger(robots: Array<Pair<Int, Int>>, isDone: BooleanArray): Int {
        var cnt = 0
        val isCounted = BooleanArray(robots.size) { false }
        var flag:Boolean
        for (i in 0 until robots.size) {
            if (isDone[i]) {
                continue
            }
            flag = false
            for (j in (i + 1) until robots.size) {
                if (isDone[j]) {
                    continue
                }
                if (!isCounted[j] && robots[i] == robots[j]) {
                    isCounted[j] = true
                    flag = true
                }
            }
            if (flag) {
                cnt++
            }
        }
        return cnt
    }

}