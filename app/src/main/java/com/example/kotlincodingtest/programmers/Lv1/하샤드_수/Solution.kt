package com.example.kotlincodingtest.programmers.Lv1.하샤드_수

class Solution {
    fun solution(x: Int): Boolean {
        val xString = x.toString()

        var sum = 0
        for (i in xString.indices) {
            sum += xString[i] - '0'
        }

        return (x % sum) == 0
    }
}