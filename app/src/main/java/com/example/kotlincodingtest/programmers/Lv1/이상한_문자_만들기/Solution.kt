package com.example.kotlincodingtest.programmers.Lv1.이상한_문자_만들기

class Solution {
    fun solution(s: String): String {
        var answer = ""
        s.split(' ').forEach { word ->
            word.forEachIndexed { i, c ->
                if (i % 2 == 0) {
                    answer += c.toUpperCase()
                } else {
                    answer += c.toLowerCase()
                }
            }
            answer += ' '
        }
        return answer.dropLast(1)
    }
}