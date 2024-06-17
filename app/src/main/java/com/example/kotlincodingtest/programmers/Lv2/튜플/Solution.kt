package com.example.kotlincodingtest.programmers.Lv2.튜플

class Solution {
    fun solution(s: String): IntArray {
        val input = s.drop(2).dropLast(2).split("},{")
            .map{it.split(',')}
            .sortedBy{it.size}
        var answer = IntArray(input.size) { 0 }
        var answerSet = mutableSetOf<Int>()

        var idx = 0
        input.forEach{ nums ->
            for (n in nums) {
                if (!answerSet.contains(n.toInt())) {
                    answerSet.add(n.toInt())
                    answer[idx++] = n.toInt()
                    break
                }
            }
        }

        return answer
    }
}