package com.example.kotlincodingtest.programmers.Lv3.베스트앨범

import java.util.PriorityQueue

class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        var answer = intArrayOf()
        val N = genres.toSet().size
        var num = 0
        val bestQ = MutableList(N) {
            PriorityQueue<Pair<Int, Int>>(compareByDescending { it.second })
        }
        val numMap = mutableMapOf<String, Int>()

        var genre: String
        for (i in genres.indices) {
            genre = genres[i]
            if (numMap[genre] == null) {
                numMap[genre] = num++
            }
            bestQ[numMap[genre]!!].add(Pair(i, plays[i]))
        }

        bestQ.sortByDescending { it.sumOf { it.second } }

        for (i in 0 until N) {
            repeat(2) {
                if (bestQ[i].isNotEmpty()) {
                    answer += bestQ[i].remove().first
                }
            }
        }


        return answer
    }
}