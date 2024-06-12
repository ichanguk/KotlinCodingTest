package com.example.kotlincodingtest.programmers.Lv1.문자열_내림차순으로_배치하기

class Solution {
    fun solution(s: String): String {
        return String(s.toCharArray().sortedArrayDescending())
    }
}