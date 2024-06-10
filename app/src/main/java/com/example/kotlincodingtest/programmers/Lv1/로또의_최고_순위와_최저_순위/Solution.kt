package com.example.kotlincodingtest.programmers.Lv1.로또의_최고_순위와_최저_순위

class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer = IntArray(2) { 0 }
        var winMap = mutableMapOf<Int, Boolean>()

        for (win in win_nums) {
            winMap[win] = true
        }

        var cnt = 0
        var zeroCnt = 0
        for (lotto in lottos) {
            if (lotto == 0) {
                zeroCnt++
            } else if (winMap[lotto] != null) {
                cnt++
            }
        }

        if (cnt == 0) {
            answer[1] = 6
        } else {
            answer[1] = 7 - cnt
        }

        if (cnt + zeroCnt == 0) {
            answer[0] = 6
        } else {
            answer[0] = 7 - cnt - zeroCnt
        }

        return answer
    }
}