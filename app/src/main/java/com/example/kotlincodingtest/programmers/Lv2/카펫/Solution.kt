package com.example.kotlincodingtest.programmers.Lv2.카펫

class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var w = 3
        var h = 3
        var b = 8
        var y = 1

        while (b != brown || y != yellow) {
            if (w == h) {
                w++
                b = (w + 1) * 2
                h = 3
                y = w - 2
            } else {
                h++
                y += (w - 2)
                b += 2
            }
        }

        return intArrayOf(w, h)
    }
}