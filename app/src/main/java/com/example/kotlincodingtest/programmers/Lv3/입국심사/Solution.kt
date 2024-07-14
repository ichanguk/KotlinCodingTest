package com.example.kotlincodingtest.programmers.Lv3.입국심사

class Solution {
    fun solution(n: Int, times: IntArray): Long {
        var answer: Long = 0
        times.sort()
        val N = times.size
        var l = 0L
        var h= times[N - 1].toLong() * n
        var m: Long

        var cnt = 0L
        while (l <= h) {
            cnt = 0L
            m = (l + h) / 2

            times.forEach{
                cnt += m / it
            }

            if (cnt >= n) {
                answer = m
                h = m - 1
            } else {
                l = m + 1
            }
        }

        return answer
    }
}