package com.example.kotlincodingtest.programmers.Lv2.숫자_변환하기

class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        val dp = MutableList(y + 1){ 1000000 }
        dp[x] = 0
        for (i in x..y) {
            if (i - n >= x) {
                dp[i] = minOf(dp[i], dp[i - n] + 1)
            }
            if (i % 2 == 0) {
                dp[i] = minOf(dp[i], dp[i / 2] + 1)
            }
            if (i % 3 == 0) {
                dp[i] = minOf(dp[i], dp[i / 3] + 1)
            }
        }
        if (dp[y] == 1000000) {
            return - 1
        } else {
            return dp[y]
        }
    }
}