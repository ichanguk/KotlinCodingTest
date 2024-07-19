package com.example.kotlincodingtest.programmers.Lv3.보석쇼핑

class Solution {
    fun solution(gems: Array<String>): IntArray {
        var answer = intArrayOf(1, gems.size)
        var minLen = 100000
        val N = gems.toSet().size

        val gemMap = mutableMapOf<String, Int>()

        var s = 0
        for (i in 0 until gems.size) {
            gemMap[gems[i]] = gemMap.getOrDefault(gems[i], 0) + 1
            while (gemMap.size == N) {
                if ((i - s) < answer[1] - answer[0]) {
                    answer = intArrayOf(s + 1, i + 1)
                } else {
                    gemMap[gems[s]] = gemMap[gems[s]]!! - 1
                    if (gemMap[gems[s]]!! == 0) {
                        gemMap.remove(gems[s])
                    }
                    s++
                }
            }
        }

        return answer
    }
}