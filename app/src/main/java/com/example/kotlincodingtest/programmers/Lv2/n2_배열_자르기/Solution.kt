package com.example.kotlincodingtest.programmers.Lv2.n2_배열_자르기

class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var answer = IntArray((right - left + 1).toInt()) { 0 }

        for (i in left..right) {
            answer[(i - left).toInt()] = (maxOf(i / n, i % n) + 1).toInt()
        }

        return answer
    }
}