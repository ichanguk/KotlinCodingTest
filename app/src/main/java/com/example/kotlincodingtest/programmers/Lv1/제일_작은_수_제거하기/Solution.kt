package com.example.kotlincodingtest.programmers.Lv1.제일_작은_수_제거하기

class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = arr.toMutableList()
        answer.remove(answer.minOrNull())
        if (answer.size == 0) {
            return intArrayOf(-1)
        } else {
            return answer.toIntArray()
        }
    }
}