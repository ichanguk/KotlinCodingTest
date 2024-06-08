package com.example.kotlincodingtest.programmers.Lv1.푸드파이트대회

class Solution {
    fun solution(food: IntArray): String {
        val sb = StringBuilder()
        sb.append('0')
        for (i in (food.size - 1) downTo 1) {
            repeat(food[i] / 2) {
                sb.append(i)
                sb.insert(0, i)
            }
        }
        return sb.toString()
    }
}