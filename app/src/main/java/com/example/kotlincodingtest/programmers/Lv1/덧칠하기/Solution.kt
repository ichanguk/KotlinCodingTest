package com.example.kotlincodingtest.programmers.Lv1.덧칠하기

class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var wall = MutableList(n + 1) { 0 }
        for (s in section) {
            wall[s] = 1
        }

        var i = 1
        while (i <= n) {
            if (wall[i] == 1) {
                answer++
                i += m
            } else {
                i ++
            }
        }


        return answer
    }
}