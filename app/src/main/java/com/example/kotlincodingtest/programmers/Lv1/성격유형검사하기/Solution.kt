package com.example.kotlincodingtest.programmers.Lv1.성격유형검사하기

class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer = ""
        var scoreMap = mutableMapOf(
            'R' to 0, 'T' to 0,
            'C' to 0, 'F' to 0,
            'J' to 0, 'M' to 0,
            'A' to 0, 'N' to 0
        )

        for (i in survey.indices) {
            if (choices[i] > 4) {
                scoreMap[survey[i][1]] = scoreMap[survey[i][1]]!! + choices[i] - 4
            } else {
                scoreMap[survey[i][0]] = scoreMap[survey[i][0]]!! + 4 - choices[i]
            }
        }

        val scoreList = scoreMap.toList()
        for (i in 0 until 8 step 2) {
            if (scoreList[i].second >= scoreList[i + 1].second) {
                answer += scoreList[i].first
            } else {
                answer += scoreList[i + 1].first
            }
        }

        return answer
    }
}