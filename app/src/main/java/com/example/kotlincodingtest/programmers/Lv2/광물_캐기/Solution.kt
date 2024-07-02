package com.example.kotlincodingtest.programmers.Lv2.광물_캐기

import java.util.PriorityQueue

class Solution {
    fun solution(picks: IntArray, minerals: Array<String>): Int {
        var answer: Int = 0
        val N = minerals.size

        val mMap = mapOf("diamond" to 25,
            "iron" to 5,
            "stone" to 1)
        var pickCnt = minOf(N, picks.sum() * 5)

        val pq = PriorityQueue<Pair<Int, Int>>(compareByDescending{it.first})
        var sum = 0
        for (i in 0 until pickCnt step 5) {
            sum = 0
            for (j in i until (i + 5)) {
                if (j >= N) {
                    break
                }
                sum += mMap[minerals[j]]!!
            }
            pq.add(Pair(sum, i))
        }

        while (pq.isNotEmpty()) {
            val cur = pq.remove()
            for (i in 0 until 3) {
                if (picks[i] > 0) {
                    picks[i]--
                    for (j in cur.second until cur.second + 5) {
                        if (j >= N) {
                            break
                        }
                        when (i) {
                            0 -> answer++
                            1 -> {
                                when (minerals[j]) {
                                    "diamond" -> answer += 5
                                    else -> answer++
                                }
                            }
                            2 -> {
                                answer += mMap[minerals[j]]!!
                            }
                        }
                    }
                    break
                }
            }

        }

        return answer
    }
}