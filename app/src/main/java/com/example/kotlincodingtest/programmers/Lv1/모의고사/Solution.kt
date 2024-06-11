package com.example.kotlincodingtest.programmers.Lv1.모의고사

class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        val cntList = mutableListOf(0, 0, 0)

        val a1 = mutableListOf(1, 2, 3, 4, 5)
        val a2 = mutableListOf(2, 1, 2, 3, 2, 4, 2, 5)
        val a3 = mutableListOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        for (i in answers.indices) {
            if (answers[i] == a1[i % a1.size]) {
                cntList[0]++
            }
            if (answers[i] == a2[i % a2.size]) {
                cntList[1]++
            }
            if (answers[i] == a3[i % a3.size]) {
                cntList[2]++
            }
        }
        val maxCnt = cntList.maxOrNull()
        for (i in 0..2) {
            if (cntList[i] == maxCnt) {
                answer.add(i + 1)
            }
        }

        return answer.toIntArray()
    }
}