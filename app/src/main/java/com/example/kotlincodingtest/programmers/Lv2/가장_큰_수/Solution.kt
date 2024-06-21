package com.example.kotlincodingtest.programmers.Lv2.가장_큰_수

class Solution {
    fun solution(numbers: IntArray): String {
        val sortedList = numbers.sortedWith{ num1, num2 ->
            "$num2$num1".compareTo("$num1$num2")
        }
        if (sortedList[0] == 0) {
            return "0"
        }

        return sortedList.map{ it }.joinToString("")
    }
}

