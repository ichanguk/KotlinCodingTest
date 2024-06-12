package com.example.kotlincodingtest.programmers.Lv1.핸드폰_번호_가리기

class Solution {
    fun solution(phone_number: String): String {
        var answer = ""

        for (i in 0 until phone_number.length) {
            if (i < phone_number.length - 4) {
                answer += '*'
            } else {
                answer += phone_number[i]
            }
        }
        return answer
    }
}