package com.example.kotlincodingtest.programmers.Lv2.혼자_놀기의_달인

class Solution {

    fun solution(cards: IntArray): Int {
        val N = cards.size
        var cntList = mutableListOf<Int>()

        val isVisit = BooleanArray(N) { false }

        for (i in 0 until N) {
            if (!isVisit[i]) {
                cntList.add(bfs(i, cards, N, isVisit))
            }
        }

        if (cntList.size == 1) {
            return 0
        } else {
            cntList.sortDescending()
            return cntList[0] * cntList[1]
        }
    }

    fun bfs(s: Int, cards: IntArray, n: Int, isVisit:BooleanArray):Int {
        var cnt = 0
        val q = ArrayDeque<Int>()
        q.addFirst(s)
        isVisit[s] = true

        while (q.isNotEmpty()) {
            val cur = q.removeFirst()
            cnt++

            if (!isVisit[cards[cur] - 1]) {
                isVisit[cards[cur] - 1] = true
                q.addLast(cards[cur] - 1)
            }
        }
        return cnt
    }
}