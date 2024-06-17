package com.example.kotlincodingtest.programmers.Lv2.프로세스

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        val dq = ArrayDeque<Pair<Int, Int>>()
        val sortedList = priorities.sortedDescending()
        for (i in priorities.indices) {
            dq.addLast(Pair(priorities[i], i))
        }
        var cur:Pair<Int, Int>
        var maxIdx = 0
        while (true) {
            cur = dq.removeFirst()
            if (cur.first == sortedList[maxIdx]) {
                answer++
                maxIdx++
                if (cur.second == location) {
                    break
                }
            } else {
                dq.addLast(cur)
            }
        }
        return answer
    }
}