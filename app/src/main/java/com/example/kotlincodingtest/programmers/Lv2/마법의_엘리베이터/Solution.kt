package com.example.kotlincodingtest.programmers.Lv2.마법의_엘리베이터

class Solution {
    fun solution(storey: Int): Int {
        var answer: Int = 0

        var cur = storey
        while (cur != 0) {
            if (cur % 10 == 0) {
                cur /= 10
                continue
            } else {
                if (cur % 10 < 5) {
                    answer += cur % 10
                } else if (cur % 10 == 5) {
                    if (cur % 100 in 55..95) {
                        cur += 5
                    }
                    answer += 5
                } else {
                    answer += 10 - (cur % 10)
                    cur += 10 - (cur % 10)
                }
                cur /= 10
            }
        }

        return answer
    }
}