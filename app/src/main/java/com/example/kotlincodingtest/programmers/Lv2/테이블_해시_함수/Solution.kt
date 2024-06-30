package com.example.kotlincodingtest.programmers.Lv2.테이블_해시_함수

class Solution {
    fun solution(data: Array<IntArray>, col: Int, row_begin: Int, row_end: Int): Int {
        var answer: Int = 0
        data.sortWith(
            compareBy<IntArray>{
                it[col - 1]
            }.thenByDescending{
                it[0]
            }
        )

        var sum:Int
        for (i in (row_begin - 1) until row_end) {
            sum = 0
            data[i].forEach {
                sum += it % (i + 1)
            }
            if (i == row_begin - 1) {
                answer = sum
            } else {
                answer = answer xor sum
            }
        }
        return answer
    }
}