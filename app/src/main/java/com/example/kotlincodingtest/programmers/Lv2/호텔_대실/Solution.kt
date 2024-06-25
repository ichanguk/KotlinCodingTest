package com.example.kotlincodingtest.programmers.Lv2.호텔_대실

class Solution {
    fun solution(book_time: Array<Array<String>>): Int {
        var answer: Int = 0
        book_time.sortBy{it[0]}

        val N = book_time.size
        val isVisit = MutableList(N) { false }
        var cnt = 0

        var startIdx = 0
        var endTime = ""
        while (cnt < N) {
            answer++
            for (i in book_time.indices) {
                if (!isVisit[i]) {
                    isVisit[i] = true
                    cnt++
                    endTime = book_time[i][1]
                    startIdx = i + 1
                    break
                }
            }

            for (i in startIdx until N) {
                if (!isVisit[i] && calDiff(endTime, book_time[i][0]) >= 10) {
                    isVisit[i] = true
                    cnt++
                    endTime = book_time[i][1]
                }
            }
        }

        return answer
    }
}

fun calDiff(endTime: String, startTime:String):Int {
    val endT = endTime.split(':')
    val startT = startTime.split(':')
    return startT[0].toInt() * 60 + startT[1].toInt() -
            (endT[0].toInt() * 60 + endT[1].toInt())
}