package com.example.kotlincodingtest.programmers.Lv2.H_Index

class Solution {
    fun solution(citations: IntArray): Int {
        citations.sortDescending()

        var h = citations.size
        while (h > 0) {
            if (citations[h - 1] >= h) {
                break
            }
            h--
        }

        return h
    }
}