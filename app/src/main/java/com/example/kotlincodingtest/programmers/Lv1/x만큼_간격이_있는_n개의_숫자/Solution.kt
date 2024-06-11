package com.example.kotlincodingtest.programmers.Lv1.x만큼_간격이_있는_n개의_숫자

class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n){0}
        for (i in 0 until n) {
            answer[i] = x.toLong() * (i + 1)
        }
        return answer
    }
}