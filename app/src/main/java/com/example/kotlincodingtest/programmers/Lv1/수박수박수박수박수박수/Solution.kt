package com.example.kotlincodingtest.programmers.Lv1.수박수박수박수박수박수

class Solution {
    fun solution(n: Int): String {
        var answer = ""
        repeat(n / 2) {
            answer += "수박"
        }
        if (n % 2 == 1) {
            answer += "수"
        }
        return answer
    }
}