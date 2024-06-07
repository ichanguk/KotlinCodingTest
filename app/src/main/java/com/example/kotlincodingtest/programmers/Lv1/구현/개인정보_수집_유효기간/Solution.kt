package com.example.kotlincodingtest.programmers.Lv1.구현.개인정보_수집_유효기간

class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val answer = mutableListOf<Int>()
        val termMap = mutableMapOf<String, Int>()
        val (todayY, todayM, todayD) = today.split('.').map { it.toInt() }
        for (term in terms) {
            termMap[term[0].toString()] = term.split(' ')[1].toInt()
        }

        for (i in privacies.indices) {
            var (curDate, curType) = privacies[i].split(' ')
            var (curY, curM, curD) = curDate.split('.').map { it.toInt() }

            curD--
            if (curD == 0) {
                curD = 28
                curM--
                if (curM == 0) {
                    curM = 12
                    curY--
                }
            }
            while (curM + termMap[curType]!! > 12) {
                curY++
                curM -= 12
            }
            curM += termMap[curType]!!
            if (curY < todayY ||
                (curY == todayY && curM < todayM) ||
                (curY == todayY && curM == todayM && curD < todayD)
            ) {
                answer.add(i + 1)
            }
        }
        return answer.toIntArray()
    }
}