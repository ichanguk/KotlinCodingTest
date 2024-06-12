package com.example.kotlincodingtest.programmers.Lv1._2016년

class Solution {
    fun solution(a: Int, b: Int): String {
        val DAY = listOf("FRI","SAT","SUN","MON","TUE","WED","THU")
        val MONTH_DAY = listOf(31,29,31,30,31,30,31,31,30,31,30,31)
        var cnt = MONTH_DAY.subList(0, a - 1).sum() - 1
        return DAY[(cnt + b) % 7]
    }
}