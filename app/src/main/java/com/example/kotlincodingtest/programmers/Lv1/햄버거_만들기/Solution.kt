package com.example.kotlincodingtest.programmers.Lv1.햄버거_만들기

class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        var bugurList = mutableListOf<Int>()

        var s = 0
        for (i in ingredient.indices) {
            bugurList.add(ingredient[i])
            s = bugurList.size
            if (s >= 4) {
                if (bugurList[s - 1] == 1
                    && bugurList[s - 2] == 3
                    && bugurList[s - 3] == 2
                    && bugurList[s - 4] == 1) {
                    answer++
                    repeat(4) {
                        bugurList.removeLast()
                    }
                }
            }
        }
        return answer
    }
}