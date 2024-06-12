package com.example.kotlincodingtest.programmers.Lv1.콜라츠_추측

class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var n = num.toLong()
        while (answer <= 500 && n != 1L) {
            if (n % 2 == 0L) {
                n /= 2
            } else {
                n = n * 3 + 1
            }
            answer++
        }
        if (answer > 500) {
            answer = -1
        }
        return answer
    }
}