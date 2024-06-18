package com.example.kotlincodingtest.programmers.Lv2.타켓_넘버

class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0
        val q = ArrayDeque<Pair<Int,Int>>()
        val N = numbers.size
        q.addLast(Pair(numbers[0], 1))
        q.addLast(Pair(numbers[0] * (-1), 1))

        var n:Int
        var idx:Int
        while (q.isNotEmpty()) {
            n = q.first().first
            idx = q.first().second
            q.removeFirst()

            if (idx == N) {
                if (n == target) {
                    answer++
                }
                continue
            }
            q.addLast(Pair(n + numbers[idx], idx + 1))
            q.addLast(Pair(n - numbers[idx], idx + 1))
        }
        return answer
    }
}