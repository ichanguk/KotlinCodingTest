package com.example.kotlincodingtest.programmers.Lv2.연속_부분_수열_합의_개수

class Solution {
    fun solution(elements: IntArray): Int {
        val N = elements.size
        val answerSet = mutableSetOf<Int>()
        var sum = 0
        for (i in 0 until N) {
            sum = 0
            for (j in i until (i + N)) {
                sum += elements[j % N]
                answerSet.add(sum)
            }
        }
        return answerSet.size
    }
}