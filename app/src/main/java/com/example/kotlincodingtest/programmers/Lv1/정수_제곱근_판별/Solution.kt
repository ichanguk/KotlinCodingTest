package com.example.kotlincodingtest.programmers.Lv1.정수_제곱근_판별

import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        val sqrtN = sqrt(n.toDouble()).toLong()
        if (sqrtN * sqrtN == n) {
            return (sqrtN + 1) * (sqrtN + 1)
        } else {
            return -1L
        }
    }
}