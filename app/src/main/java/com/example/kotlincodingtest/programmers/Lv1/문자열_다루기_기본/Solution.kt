package com.example.kotlincodingtest.programmers.Lv1.문자열_다루기_기본

class Solution {
    fun solution(s: String): Boolean {
        if (!(s.length == 4 || s.length == 6)) {
            return false
        }
        try {
            s.toInt()
        } catch (e: Exception) {
            return false
        }
        return true
    }
}