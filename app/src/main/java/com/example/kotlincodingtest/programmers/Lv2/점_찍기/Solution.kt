package com.example.kotlincodingtest.programmers.Lv2.점_찍기

import kotlin.math.*

class Solution {
    fun solution(k: Int, d: Int): Long {
        var answer: Long = 0
        var y = 0.0
        for(x in 0..d step k) {
            y = sqrt(d.toDouble() * d - x.toDouble() * x);
            answer += floor(y / k).toLong() + 1;
        }
        return answer
    }
}