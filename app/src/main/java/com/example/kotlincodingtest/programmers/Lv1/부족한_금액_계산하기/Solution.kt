package com.example.kotlincodingtest.programmers.Lv1.부족한_금액_계산하기

class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        // 3 + 6 + 9 + 12 = 30
        var needMoney: Long = count.toLong() * (count + 1) / 2 * price

        if (needMoney > money) {
            answer = needMoney - money
        } else {
            answer = 0
        }

        return answer
    }
}