package com.example.kotlincodingtest.programmers.Lv1.신고_결과_받기

class Solution {
    fun solution(id_list: Array<String>, reportList: Array<String>, k: Int): IntArray {
        val N = id_list.size
        var answer = IntArray(N, { 0 })
        val indexMap = mutableMapOf<String, Int>()
        val reportMap = mutableMapOf<String, Int>()
        for (i in id_list.indices) {
            reportMap[id_list[i]] = 0
            indexMap[id_list[i]] = i
        }
        val reportedList = MutableList(N) { MutableList(N) { false } }
        for (report in reportList) {
            val (a, b) = report.split(' ')
            if (!reportedList[indexMap[a]!!][indexMap[b]!!]) {
                reportedList[indexMap[a]!!][indexMap[b]!!] = true
                reportMap[b] = reportMap[b]!! + 1
            }
        }

        val result = reportMap.toList()
        for (i in 0 until N) {
            if (result[i].second >= k) {
                for (j in 0 until N) {
                    if (reportedList[j][i]) {
                        answer[j]++
                    }
                }
            }
        }
        return answer
    }
}