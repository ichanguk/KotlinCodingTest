package com.example.kotlincodingtest.programmers.Lv1.삼진법_뒤집기

class Solution {
    fun solution(n: Int): Int {
        return n.toString(3).reversed().toInt(3)
    }

}