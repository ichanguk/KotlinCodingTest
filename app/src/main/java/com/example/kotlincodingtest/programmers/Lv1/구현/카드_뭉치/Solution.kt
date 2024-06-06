package com.example.kotlincodingtest.programmers.Lv1.구현.카드_뭉치

class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var idx1 = 0
        var idx2 = 0
        for (card in goal) {
            if (idx1 < cards1.size && cards1[idx1] == card) {
                idx1++
            } else if (idx2 < cards2.size && cards2[idx2] == card) {
                idx2++
            } else {
                return "No"
            }
        }

        return "Yes"
    }
}