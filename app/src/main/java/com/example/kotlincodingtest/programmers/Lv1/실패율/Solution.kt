package com.example.kotlincodingtest.programmers.Lv1.실패율

class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = mutableListOf<Int>()

        val challengers = MutableList(N + 2) { 0 }

        for (s in stages) {
            for (i in 1..s) {
                challengers[i]++
            }
        }

        var failList = MutableList(N + 1) { Pair(0.0, 0) }

        for (i in 1..N) {
            if (challengers[i] == 0) {
                failList[i] = Pair(0.0, i)
            } else {
                failList[i] = Pair(
                    (challengers[i] - challengers[i + 1]).toDouble() /
                            challengers[i], i
                )
            }
        }

        failList.sortWith(
            compareByDescending<Pair<Double, Int>> { it.first }
                .thenBy { it.second }
        )

        failList.forEach { it ->
            if (it.second != 0) {
                answer.add(it.second)
            }
        }


        return answer.toIntArray()
    }
}