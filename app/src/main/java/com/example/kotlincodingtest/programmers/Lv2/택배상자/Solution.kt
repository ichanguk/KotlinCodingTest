package com.example.kotlincodingtest.programmers.Lv2.택배상자

class Solution {
    fun solution(order: IntArray): Int {
        var answer: Int = 0
        val tempContainer = ArrayDeque<Int>()
        var cur = 1
        while (answer < order.size) {
            if (order[answer] == cur) {
                cur++
                answer++
            } else if (tempContainer.isNotEmpty()
                && tempContainer.last() == order[answer]) {
                answer++
                tempContainer.removeLast()
            } else if (order[answer] < cur) {
                break
            } else {
                tempContainer.addLast(cur++)
            }
        }

        return answer
    }
}