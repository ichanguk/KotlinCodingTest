package com.example.kotlincodingtest.programmers.Lv2.모음_사전

import kotlin.math.pow

class Solution {
    fun solution(word: String): Int {
        val vowelMap = mutableMapOf('A' to 0, 'E' to 1,
            'I' to 2, 'O' to 3,
            'U' to 4)
        var answer = 0
        var prevCnt = 1 + 5 + 25 + 125 + 625
        for (i in word.indices) {
            answer += prevCnt * vowelMap[word[i]]!! + 1
            prevCnt -= (5.0.pow(4 - i)).toInt()
        }

        return answer
    }
}