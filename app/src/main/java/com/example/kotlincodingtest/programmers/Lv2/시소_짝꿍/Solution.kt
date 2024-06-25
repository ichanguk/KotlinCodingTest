package com.example.kotlincodingtest.programmers.Lv2.시소_짝꿍

class Solution {
    fun solution(weights: IntArray): Long {
        var answer: Long = 0
        val N = weights.size
        val wMap = mutableMapOf<Int, Int>()
        for (w in weights) {
            wMap[w] = wMap.getOrDefault(w, 0) + 1
        }

        val wList = wMap.toList()
        var curW = 0
        var curCnt = 0L
        for (i in wList.indices) {
            curW = wList[i].first
            curCnt = wList[i].second.toLong()
            answer += (curCnt * (curCnt - 1)) / 2
            for (j in (i + 1) until wList.size) {
                if (isPair(curW, wList[j].first)) {
                    answer += curCnt * wList[j].second
                }
            }
        }
        return answer
    }
}

fun isPair(w1:Int, w2:Int):Boolean {
    for (i in 2..4) {
        when (w1 * i) {
            w2 * 2, w2 * 3, w2 * 4 -> return true
        }
    }
    return false
}