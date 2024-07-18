package com.example.kotlincodingtest.programmers.Lv2.과제_진행하기

import java.util.Stack
class Solution {
    fun solution(plans: Array<Array<String>>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for (p in plans) {
            var t = p[1].split(':')

            p[1] = (t[0].toInt() * 60 + t[1].toInt()).toString()
        }
        val s = Stack<Array<String>>()

        plans.sortBy{it[1].toInt()}
        var remainT = 0

        for (i in plans.indices) {
            val (name, startT, t) = plans[i]

            while (s.isNotEmpty()) {
                val cur = s.pop()
                if (cur[1].toInt() <= remainT) {
                    remainT -= cur[1].toInt()
                    answer += cur[0]
                } else {
                    cur[1] = (cur[1].toInt() - remainT).toString()
                    s.add(cur)
                    break
                }
            }
            s.add(arrayOf(name, t))

            if (i != plans.size - 1) {
                remainT = plans[i + 1][1].toInt() - startT.toInt()
            }
        }

        while (s.isNotEmpty()) {
            answer += s.pop()[0]
        }

        return answer
    }
}