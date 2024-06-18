package com.example.kotlincodingtest.programmers.Lv2.피로도

var answer: Int = 0

class Solution {
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        var isVisit:MutableList<Boolean>
        for (i in dungeons.indices) {
            if (dungeons[i][0] > k) {
                continue
            }
            isVisit = MutableList(dungeons.size){ false }
            isVisit[i] = true
            dfs(k - dungeons[i][1], i, 1, dungeons, isVisit)
        }
        return answer
    }
}

fun dfs(energy:Int, cur:Int, cnt:Int,
        dungeons:Array<IntArray>, isVisit:MutableList<Boolean>) {
    if (cnt > answer) {
        answer = cnt
    }
    for (i in isVisit.indices) {
        if (!isVisit[i]) {
            if (energy >= dungeons[i][0]) {
                isVisit[i] = true
                dfs(energy - dungeons[i][1], i, cnt + 1, dungeons, isVisit)
                isVisit[i] = false
            }
        }
    }
}