package com.example.kotlincodingtest.programmers.Lv1.가장_가까운_같은_글자

class Solution {
    fun solution(s: String): IntArray {
        var answer = IntArray(s.length, {0})

        var cMap = mutableMapOf<Char, Int>()
        var prevIdx:Int? = 0
        for (i in 0 until s.length) {
            prevIdx = cMap[s[i]]
            if (prevIdx == null) {
                answer[i] = -1
            } else {
                answer[i] = i - prevIdx
            }
            cMap[s[i]] = i
        }
        return answer
    }
}