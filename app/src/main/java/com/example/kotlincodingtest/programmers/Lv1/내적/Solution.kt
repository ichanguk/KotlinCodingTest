package com.example.kotlincodingtest.programmers.Lv1.내적

class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0

        for (i in a.indices) {
            answer += a[i] * b[i]
        }

        return answer
    }
}