package com.example.kotlincodingtest.programmers.Lv1.문자열_나누기

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var sameCnt = 0
        var diffCnt = 0

        var flag = false
        var curChar = s[0]
        for (c in s) {
            if (!flag) {
                curChar = c
                flag = true
                sameCnt++
            } else {
                if (c != curChar) {
                    diffCnt++
                } else {
                    sameCnt++
                }
                if (sameCnt == diffCnt) {
                    answer++
                    flag = false
                }
            }
        }
        if (sameCnt != diffCnt) {
            answer++
        }
        return answer
    }
}