package com.example.kotlincodingtest.programmers.Lv1.정수_내림차순으로_배치하기

class Solution {
    fun solution(n: Long): Long {
        return String(n.toString().toCharArray().sortedArrayDescending()).toLong()

    }
}