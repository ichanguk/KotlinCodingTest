package com.example.kotlincodingtest.programmers.Lv1.자연수_뒤집어_배열로_만들기

class Solution {
    fun solution(n: Long): IntArray {
        return n.toString().toCharArray().reversed().map{it - '0'}.toIntArray()
    }
}