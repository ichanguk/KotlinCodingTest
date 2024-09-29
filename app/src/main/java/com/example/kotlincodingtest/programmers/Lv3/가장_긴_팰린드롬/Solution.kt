package com.example.kotlincodingtest.programmers.Lv3.가장_긴_팰린드롬

class Solution {
    fun solution(s: String): Int {
        var answer = 1
        val len = s.length

        val dp = Array(len){IntArray(len){ 0 }}

        for (i in 0 until len) {
            dp[i][i] = 1
        }

        for (i in 0 until len - 1) {
            if (s[i] == s[i + 1]) {
                dp[i][i + 1] = 1
                answer = 2
            }
        }

        for (k in 3..len) {
            for (i in 0..(len - k)) {
                val j = i + k - 1
                if (s[i] == s[j] && dp[i + 1][j - 1] == 1) {
                    dp[i][j] = 1
                    answer = maxOf(answer, k)
                }
            }
        }


        return answer
    }
}