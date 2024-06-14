package com.example.kotlincodingtest.programmers.Lv2.예상_대진표

class Solution {
    fun solution(n: Int, A: Int, B: Int): Int {
        var answer = 1
        var a = (A + 1) / 2
        var b = (B + 1) / 2
        while (a != b) {
            a = (a + 1) / 2
            b = (b + 1) / 2
            answer++
        }

        return answer
    }
}