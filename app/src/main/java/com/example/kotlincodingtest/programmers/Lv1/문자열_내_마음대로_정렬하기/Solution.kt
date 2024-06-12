package com.example.kotlincodingtest.programmers.Lv1.문자열_내_마음대로_정렬하기

class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        return strings.apply {
            this.sort()
            this.sortBy{it[n]}
        }
    }
}