package com.example.kotlincodingtest.programmers.Lv2.연속된_부분_수열의_합

class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        val answer: IntArray = intArrayOf(0, 0)
        val N = sequence.size

        var sum = 0
        var endIdx = 0
        var len = N
        for (i in sequence.indices) {
            while (sum < k && endIdx < N) {
                sum += sequence[endIdx++]
            }
            if (sum == k && endIdx - 1 - i < len) {
                answer[0] = i
                answer[1] = endIdx - 1
                len = endIdx - 1 - i
            }
            sum -= sequence[i]
        }

        return answer
    }
}