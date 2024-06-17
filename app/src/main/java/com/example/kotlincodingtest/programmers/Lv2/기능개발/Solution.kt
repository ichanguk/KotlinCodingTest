package com.example.kotlincodingtest.programmers.Lv2.기능개발

import kotlin.math.ceil

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        val dq = ArrayDeque<Int>()

        for (i in progresses.indices) {
            dq.addLast(ceil((100 - progresses[i]).toDouble() / speeds[i]).toInt())
        }
        var cur:Int
        var cnt:Int
        while (dq.isNotEmpty()) {
            cur = dq.removeFirst()
            cnt = 1
            while (dq.isNotEmpty() && dq.first() <= cur) {
                cnt++
                dq.removeFirst()
            }
            answer += cnt
        }

        return answer
    }
}