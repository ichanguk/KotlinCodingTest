package com.example.kotlincodingtest.programmers.Lv1.최소직사각형

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answerW = 0
        var answerH = 0

        var bigLen: Int
        var smallLen: Int
        for (size in sizes) {
            bigLen = maxOf(size[0], size[1])
            smallLen = minOf(size[0], size[1])
            if (bigLen > answerW) {
                answerW = bigLen
            }
            if (smallLen > answerH) {
                answerH = smallLen
            }
        }

        return answerW * answerH
    }
}