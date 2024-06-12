package com.example.kotlincodingtest.programmers.Lv1.자릿수_더하기

class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        n.toString().forEach {
            answer += it - '0'
        }

        return answer
    }
}