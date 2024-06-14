package com.example.kotlincodingtest.programmers.Lv2.귤_고르기

class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        val cntMap = mutableMapOf<Int, Int>()

        for (t in tangerine) {
            cntMap[t] = cntMap.getOrDefault(t, 0) + 1
        }
        val cntList = cntMap.values.sortedDescending()
        var cur = 0
        for (cnt in cntList) {
            cur += cnt
            answer++
            if (cur >= k) {
                break
            }
        }

        return answer
    }
}