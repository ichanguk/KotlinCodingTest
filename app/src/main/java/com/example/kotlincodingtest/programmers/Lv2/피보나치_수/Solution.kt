package com.example.kotlincodingtest.programmers.Lv2.피보나치_수

class Solution {
    fun solution(n: Int): Int {
        val fibo = MutableList(n + 1) { 0 }
        fibo[1] = 1

        for (i in 2..n) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1234567
        }
        return fibo[n]
    }
}