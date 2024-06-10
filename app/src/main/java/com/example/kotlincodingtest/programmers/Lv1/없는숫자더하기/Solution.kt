package com.example.kotlincodingtest.programmers.Lv1.없는숫자더하기

class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 45
        for (n in numbers) {
            answer -= n
        }
        return answer
    }
}