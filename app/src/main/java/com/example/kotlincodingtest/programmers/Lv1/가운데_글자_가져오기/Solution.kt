package com.example.kotlincodingtest.programmers.Lv1.가운데_글자_가져오기

class Solution {
    fun solution(s: String): String {
        val len = s.length
        if (len % 2 == 0) {
            return s.substring(len / 2 - 1, len / 2 + 1)
        } else {
            return s[len / 2].toString()
        }
    }
}