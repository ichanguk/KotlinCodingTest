package com.example.kotlincodingtest.programmers.Lv1.신규_아이디_추천

class Solution {
    fun solution(new_id: String): String {
        var answer = new_id.toLowerCase()

        var regex = "[^a-z0-9-._]".toRegex()
        answer = answer.replace(regex, "")

        regex = "\\.{2,}".toRegex()
        answer = answer.replace(regex, ".")

        regex = "^\\.+".toRegex()
        answer = answer.replace(regex, "")

        regex = "\\.+$".toRegex()
        answer = answer.replace(regex, "")

        if (answer.isEmpty()) {
            answer = "a"
        }
        if (answer.length >= 16) {
            answer = answer.substring(0, 15)
        }
        answer = answer.replace(regex, "")

        while (answer.length <= 2) {
            answer += answer[answer.length - 1]
        }

        return answer
    }
}