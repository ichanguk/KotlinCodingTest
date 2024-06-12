package com.example.kotlincodingtest.programmers.Lv1.짝수와_홀수

class Solution {
    fun solution(num: Int): String {
        return if (num % 2 == 0) "Even" else "Odd"
    }
}