package com.example.kotlincodingtest.programmers.Lv2.주차_요금_계산

import kotlin.math.ceil

class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        records.sortBy{it.split(' ')[1].toInt()}

        var inTime = listOf(0, 0)
        var outTime = listOf(0, 0)
        var prevNum = ""
        var outFlag = true
        var costTime = 0

        for (r in records) {
            var (t, num, inOut) = r.split(' ')
            if (inOut == "IN") {
                if (prevNum != num) {
                    if (!outFlag) {
                        costTime += calCostTime(inTime, listOf(23, 59))
                    }
                    if (costTime != 0) {
                        answer += calCost(costTime, fees)
                    }
                    costTime = 0
                    prevNum = num
                }
                inTime = t.split(':').map{it.toInt()}
                outFlag = false
            } else {
                outFlag = true
                outTime = t.split(':').map{it.toInt()}
                costTime += calCostTime(inTime, outTime)
            }
        }
        if (!outFlag) {
            costTime += calCostTime(inTime, listOf(23, 59))
        }
        answer += calCost(costTime, fees)
        return answer
    }
}

fun calCostTime(inTime:List<Int>, outTime:List<Int>):Int {
    return (outTime[0] - inTime[0]) * 60 + (outTime[1] - inTime[1])
}

fun calCost(costTime:Int, fees:IntArray):Int {
    if (costTime <= fees[0]) {
        return fees[1]
    } else {
        return fees[1] + ceil((costTime - fees[0]).toDouble() / fees[2]).toInt() * fees[3]
    }
}