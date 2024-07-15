package com.example.kotlincodingtest.programmers.Lv3.풍선_터뜨리기

class Solution {
    fun solution(a: IntArray): Int {
        var answer: Int = 1
        var lm = 1_000_000_001
        var rm = 1_000_000_001
        val canRemain = MutableList(a.size){false}

        for (i in a.indices) {
            if (a[i] < lm) {
                lm = a[i]
                canRemain[i] = true
            }
        }

        for (i in a.size - 1 downTo 0) {
            if (a[i] < rm) {
                rm = a[i]
                canRemain[i] = true
            }
        }
        answer = canRemain.count{it}

        return answer
    }
}