package com.example.kotlincodingtest.programmers.Lv2.다리를_지나는_트럭

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 1
        val passing = ArrayDeque<Pair<Int, Int>>()
        var curW = 0

        truck_weights.forEachIndexed{ idx, w ->
            while (!(passing.size < bridge_length && curW + w <= weight)) {
                curW -= passing.first().first
                if (passing.first().second + bridge_length < answer) {
                    passing.removeFirst()
                } else {
                    answer = passing.removeFirst().second + bridge_length
                }
            }
            passing.addLast(Pair(w, answer++))
            curW += w
        }

        while (passing.isNotEmpty()) {
            answer = passing.removeFirst().second + bridge_length
        }

        return answer
    }
}