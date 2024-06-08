package com.example.kotlincodingtest.programmers.Lv1.명예의_전당1

import java.util.*

class Solution {
    fun solution(k: Int, scores: IntArray): IntArray {
        var answer = IntArray(scores.size, { 0 })
        val pq = PriorityQueue<Int>()

        var curMin: Int
        for (i in scores.indices) {
            if (pq.size >= k) {
                curMin = pq.first()
                if (scores[i] > curMin) {
                    pq.remove()
                    pq.add(scores[i])
                }
            } else {
                pq.add(scores[i])
            }
            answer[i] = pq.first()
        }

        return answer
    }
}