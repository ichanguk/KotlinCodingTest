package com.example.kotlincodingtest.programmers.Lv1.구현.크기가_작은_부분_문자열

class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        var len = p.length
        var pNum = p.toLong()
        for (i in 0 .. t.length - len) {
            if (t.substring(i, i + len).toLong() <= pNum) {
                answer++
            }
        }
        return answer
    }
}