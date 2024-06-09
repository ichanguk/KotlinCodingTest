package com.example.kotlincodingtest.programmers.Lv1.옹알이2

class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val canSpeakMap = mutableMapOf(
            "aya" to true,
            "ye" to true,
            "woo" to true,
            "ma" to true
        )

        val sb = StringBuilder()
        var prevWord: String
        var checkCnt: Int
        var curWord: String
        for (word in babbling) {
            checkCnt = 0
            prevWord = ""
            sb.clear()
            for (c in word) {
                sb.append(c)
                curWord = sb.toString()
                if (canSpeakMap.getOrDefault(curWord, false)
                    && curWord != prevWord
                ) {
                    prevWord = curWord
                    checkCnt += curWord.length
                    sb.clear()
                }
            }
            if (checkCnt == word.length) {
                answer++
            }
        }

        return answer
    }
}