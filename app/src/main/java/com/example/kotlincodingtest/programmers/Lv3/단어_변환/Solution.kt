package com.example.kotlincodingtest.programmers.Lv3.단어_변환

class Solution {
    fun solution(begin: String, target: String, words: Array<String>): Int {
        val q = ArrayDeque<Pair<String, Int>>()
        val N = words.size
        val isVisit = MutableList(N){false}

        q.addLast(Pair(begin, 0))

        while (q.isNotEmpty()) {
            val cur = q.removeFirst()

            for (i in words.indices) {
                if (!isVisit[i] && countDiff(cur.first, words[i]) == 1) {
                    if (words[i] == target) {
                        return cur.second + 1
                    }
                    isVisit[i] = true
                    q.addLast(Pair(words[i], cur.second + 1))
                }
            }

        }
        return 0
    }
}

fun countDiff(s1: String, s2: String):Int {
    return s1.zip(s2).count{it.first != it.second}
}