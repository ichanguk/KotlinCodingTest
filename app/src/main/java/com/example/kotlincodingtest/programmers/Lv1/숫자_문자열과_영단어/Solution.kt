package com.example.kotlincodingtest.programmers.Lv1.숫자_문자열과_영단어

class Solution {
    fun solution(s: String): Int {
        val numMap = mutableMapOf(
            "zero" to 0, "one" to 1,
            "two" to 2, "three" to 3,
            "four" to 4, "five" to 5,
            "six" to 6, "seven" to 7,
            "eight" to 8, "nine" to 9
        )

        val curSB = StringBuilder()
        val resultSB = StringBuilder()

        for (c in s) {
            if (c.isDigit()) {
                resultSB.append(c)
            } else {
                curSB.append(c)
                if (numMap[curSB.toString()] != null) {
                    resultSB.append(numMap[curSB.toString()])
                    curSB.clear()
                }
            }
        }

        return resultSB.toString().toInt()
    }
}