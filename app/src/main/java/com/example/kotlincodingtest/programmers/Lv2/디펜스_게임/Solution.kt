package com.example.kotlincodingtest.programmers.Lv2.디펜스_게임

import java.util.PriorityQueue

class Solution {
    fun solution(n: Int, k: Int, enemy: IntArray): Int {
        var answer: Int = 0
        if (k >= enemy.size) {
            return enemy.size
        }
        val pq = PriorityQueue<Int>(compareByDescending{it})

        var curN = n
        var curK = k
        for (e in enemy) {
            pq.add(e)
            curN -= e
            if (curN < 0) {
                if (curK == 0) {
                    break
                }
                curN += pq.remove()
                curK--
            }
            answer++
        }

        return answer
    }
}