package com.example.kotlincodingtest.programmers.Lv3.여행경로

import java.util.PriorityQueue

lateinit var isVisit:BooleanArray
var answer = arrayOf<String>()

class Solution {
    fun solution(tickets: Array<Array<String>>): Array<String> {
        tickets.sortBy{it[1]}
        isVisit = BooleanArray(tickets.size)
        dfs("ICN", tickets)

        return answer
    }
}

var flag = false

fun dfs(curCity:String, tickets: Array<Array<String>>) {
    if (answer.size == tickets.size) {
        answer += curCity
        flag = true
        return
    }

    for (i in tickets.indices) {
        if (tickets[i][0] == curCity && !isVisit[i]) {
            isVisit[i] = true
            answer += curCity
            dfs(tickets[i][1], tickets)
            if (!flag) {
                isVisit[i] = false
                answer = answer.sliceArray(0 until answer.size - 1)
            }
        }
    }
}