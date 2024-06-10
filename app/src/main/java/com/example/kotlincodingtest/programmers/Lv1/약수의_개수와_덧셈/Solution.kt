package com.example.kotlincodingtest.programmers.Lv1.약수의_개수와_덧셈

import kotlin.math.*

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0

        for (i in left..right) {
            if (countFactor(i) % 2 == 0) {
                answer += i
            } else {
                answer -= i
            }
        }

        return answer
    }

    fun countFactor(n: Int): Int {
        var cnt = 0
        val sqrtN = sqrt(n.toDouble()).toInt()
        for (i in 1 until sqrtN) {
            if (n % i == 0) {
                cnt += 2
            }
        }
        if (sqrtN * sqrtN == n) {
            cnt++
        }
        return cnt
    }
}