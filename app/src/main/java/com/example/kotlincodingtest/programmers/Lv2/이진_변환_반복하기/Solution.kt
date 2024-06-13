package com.example.kotlincodingtest.programmers.Lv2.이진_변환_반복하기

class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf(0, 0)
        var x = s
        var i = 0
        while (x != "1") {
            i++
            answer[1] += x.count { it == '0' }
            x = x.replace("0+".toRegex(), "").length.toString(2)
        }
        answer[0] = i
        return answer
    }
}