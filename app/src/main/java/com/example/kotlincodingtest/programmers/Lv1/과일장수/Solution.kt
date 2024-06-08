package com.example.kotlincodingtest.programmers.Lv1.과일장수

import java.util.*

class Solution {
    fun solution(k: Int, m: Int, scores: IntArray): Int {
        var answer: Int = 0
        scores.sortDescending()
        val box = PriorityQueue<Int>()
        for (score in scores) {
            box.add(score)
            if (box.size == m) {
                answer += box.remove()
                box.clear()
            }
        }

        return answer * m
    }
}