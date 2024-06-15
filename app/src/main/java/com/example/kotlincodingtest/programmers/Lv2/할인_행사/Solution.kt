package com.example.kotlincodingtest.programmers.Lv2.할인_행사

var answer = 0
val cntMap = mutableMapOf<String, Int>()
class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        for (i in 0 until 10) {
            cntMap[discount[i]] = cntMap.getOrDefault(discount[i], 0) + 1
        }
        checkWant(want, number)
        var N = discount.size
        for (i in 10 until N) {
            cntMap[discount[i - 10]] = cntMap[discount[i - 10]]!! - 1
            cntMap[discount[i]] = cntMap.getOrDefault(discount[i], 0) + 1
            checkWant(want, number)
        }
        return answer
    }
}

fun checkWant(want: Array<String>, number: IntArray) {
    for (i in want.indices) {
        if (cntMap.getOrDefault(want[i], 0) != number[i]) {
            return
        }
    }
    answer++
}