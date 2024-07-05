package com.example.kotlincodingtest.programmers.Lv2.두_원_사이의_정수_쌍

import kotlin.math.*

class Solution {
    fun solution(r1: Int, r2: Int): Long {
        var answer: Long = 0

        var e = 0L
        var s = 0L

        for (x in 1..r2) {
            if (x < r1) {
                s = ceil(sqrt((r1.toLong() * r1 - x.toLong() * x).toDouble())).toLong()
            } else {
                s = 0L
            }
            e = sqrt((r2.toLong() * r2 - x.toLong() * x).toDouble()).toLong()
            answer += e - s + 1
        }

        return answer * 4
    }
}