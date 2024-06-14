package com.example.kotlincodingtest.programmers.Lv2.멀리_뛰기

class Solution {
    fun solution(n: Int): Long {
        val dp = MutableList(n + 1) { 0L }
        dp[0] = 1
        dp[1] = 1
        for (i in 2..n) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567
        }
        return dp[n]
    }
}