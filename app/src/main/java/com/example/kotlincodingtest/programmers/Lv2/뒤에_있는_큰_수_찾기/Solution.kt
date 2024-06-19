package com.example.kotlincodingtest.programmers.Lv2.뒤에_있는_큰_수_찾기

class Solution {
    fun solution(numbers: IntArray): IntArray {
        val N = numbers.size
        var answer = IntArray(N) { -1 }
        val dq = ArrayDeque<Pair<Int, Int>>()

        for (i in numbers.indices) {
            while (dq.isNotEmpty() && numbers[i] > dq.last().second) {
                answer[dq.last().first] = numbers[i]
                dq.removeLast()
            }
            dq.addLast(Pair(i, numbers[i]))
        }
        return answer
    }
}