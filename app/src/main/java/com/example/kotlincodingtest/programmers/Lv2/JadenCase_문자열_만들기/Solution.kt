package com.example.kotlincodingtest.programmers.Lv2.JadenCase_문자열_만들기

class Solution {
    fun solution(s: String): String {
        var answer = ""
        var flag = if (s[0] == ' ') false else true
        for (c in s) {
            if (c == ' ') {
                flag = true
                answer += ' '
            } else if (flag) {
                answer += c.toUpperCase()
                flag = false
            } else {
                answer += c.toLowerCase()
            }
        }
        return answer
    }
}