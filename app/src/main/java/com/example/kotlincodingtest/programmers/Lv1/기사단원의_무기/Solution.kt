package com.example.kotlincodingtest.programmers.Lv1.기사단원의_무기

import kotlin.math.*

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0

        var cnt: Int
        for (n in 1..number) {
            cnt = countFactors(n)
            if (cnt > limit) {
                answer += power
            } else {
                answer += cnt
            }
        }
        return answer
    }

    fun countFactors(n: Int): Int {
        var cnt = 0
        for (i in 1..sqrt(n.toDouble()).toInt()) {
            if (i * i == n) {
                cnt++
            } else if (n % i == 0) {
                cnt += 2
            }
        }
        return cnt
    }
}