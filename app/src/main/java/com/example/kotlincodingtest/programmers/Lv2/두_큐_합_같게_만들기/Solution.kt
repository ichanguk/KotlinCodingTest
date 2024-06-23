package com.example.kotlincodingtest.programmers.Lv2.두_큐_합_같게_만들기

class Solution {
    fun solution(queue1: IntArray, queue2: IntArray): Int {
        var q1 = ArrayDeque<Int>()
        var q2 = ArrayDeque<Int>()

        var sum1 = 0L
        var sum2 = 0L
        for (n in queue1) {
            sum1 += n
            q1.addLast(n)
        }

        for (n in queue2) {
            sum2 += n
            q2.addLast(n)
        }

        var cnt = 0
        while (cnt <= queue1.size * 4) {
            if (sum1 == sum2) {
                return cnt
            } else if (sum1 > sum2) {
                sum1 -= q1.first()
                sum2 += q1.first()
                q2.addLast(q1.removeFirst())
            }  else {
                sum1 += q2.first()
                sum2 -= q2.first()
                q1.addLast(q2.removeFirst())
            }
            cnt++
        }

        return -1
    }
}