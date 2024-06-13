package com.example.kotlincodingtest.programmers.Lv2.최댓값과_최솟값

class Solution {
    fun solution(s: String): String {
        var answer = ""
        val sToNum = s.split(' ').map{it.toLong()}

        answer += sToNum.minOrNull()
        answer += ' '
        answer += sToNum.maxOrNull()
        return answer
    }
}