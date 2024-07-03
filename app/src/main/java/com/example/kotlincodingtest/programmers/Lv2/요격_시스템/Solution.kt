package com.example.kotlincodingtest.programmers.Lv2.요격_시스템

class Solution {
    fun solution(targets: Array<IntArray>): Int {
        var answer: Int = 0
        targets.sortBy{it[1]}

        var e = targets[0][1]
        answer++
        for (t in targets) {
            if (t[0] >= e) {
                answer++
                e = t[1]
            }
        }
        return answer
    }
}