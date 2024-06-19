package com.example.kotlincodingtest.programmers.Lv2.롤케이크_자르기

class Solution {
    fun solution(topping: IntArray): Int {
        var answer: Int = 0
        val leftTopping = mutableMapOf<Int, Int>()
        val rightTopping = mutableMapOf<Int, Int>()


        var leftCnt = 0
        var rightCnt = 0

        for (t in topping) {
            rightTopping[t] = rightTopping.getOrDefault(t, 0) + 1
            if (rightTopping[t] == 1) {
                rightCnt++
            }
        }

        for (t in topping) {
            leftTopping[t] = leftTopping.getOrDefault(t, 0) + 1
            if (leftTopping[t] == 1) {
                leftCnt++
            }
            rightTopping[t] = rightTopping[t]!! - 1
            if (rightTopping[t] == 0) {
                rightCnt--
            }
            if (leftCnt == rightCnt) {
                answer++
            }
        }

        return answer
    }
}