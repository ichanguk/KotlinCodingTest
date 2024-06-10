package com.example.kotlincodingtest.programmers.Lv1.음양_더하기

class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0

        absolutes.forEachIndexed { i, n ->
            if (signs[i]) {
                answer += n
            } else {
                answer -= n
            }
        }

        return answer
    }
}