package com.example.kotlincodingtest.programmers.Lv1.시저_암호

class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        s.forEach{
            if (it.isUpperCase()) {
                answer += 'A' + (it + n - 'A') % 26
            } else if (it.isLowerCase()) {
                answer += 'a' + (it + n - 'a') % 26
            } else {
                answer += ' '
            }
        }
        return answer
    }
}