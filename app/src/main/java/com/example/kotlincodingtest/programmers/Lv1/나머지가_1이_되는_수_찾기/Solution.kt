package com.example.kotlincodingtest.programmers.Lv1.나머지가_1이_되는_수_찾기

class Solution {
    fun solution(n: Int): Int {
        for (i in 1 until n) {
            if (n % i == 1) {
                return i
            }
        }
        return 0
    }
}