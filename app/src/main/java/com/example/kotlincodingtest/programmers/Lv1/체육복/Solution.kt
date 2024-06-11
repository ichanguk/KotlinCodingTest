package com.example.kotlincodingtest.programmers.Lv1.체육복

class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        val countList = MutableList(n + 1) { 1 }

        for (l in lost) {
            countList[l]--
        }
        for (r in reserve) {
            countList[r]++
        }

        for (i in 1..n) {
            if (countList[i] == 0) {
                if (countList[i - 1] == 2) {
                    countList[i - 1] = 1
                    countList[i] = 1
                } else if (i != n && countList[i + 1] == 2) {
                    countList[i + 1] = 1
                    countList[i] = 1
                }
            }
        }

        for (i in 1..n) {
            if (countList[i] >= 1) {
                answer++
            }
        }

        return answer
    }
}