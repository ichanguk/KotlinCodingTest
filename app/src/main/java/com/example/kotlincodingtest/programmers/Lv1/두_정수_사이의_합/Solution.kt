package com.example.kotlincodingtest.programmers.Lv1.두_정수_사이의_합

class Solution {
    fun solution(a: Int, b: Int): Long {
        val A = if (a <= b) a.toLong() else b.toLong()
        val B = if (a <= b) b.toLong() else a.toLong()
        return (A..B).sum()
    }
}