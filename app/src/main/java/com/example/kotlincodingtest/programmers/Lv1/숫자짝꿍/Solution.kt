package com.example.kotlincodingtest.programmers.Lv1.숫자짝꿍

class Solution {
    fun solution(X: String, Y: String): String {
        val xMap = mutableMapOf<Int, Int>()
        val yMap = mutableMapOf<Int, Int>()
        initMap(xMap)
        initMap(yMap)
        for (x in X) {
            xMap[x - '0'] = xMap[x - '0']!! + 1
        }
        for (y in Y) {
            yMap[y - '0'] = yMap[y - '0']!! + 1
        }

        val sb = StringBuilder()
        var curNum = 9
        while (curNum >= 0) {
            if (xMap[curNum]!! > 0 && yMap[curNum]!! > 0) {
                sb.append(curNum)
                xMap[curNum] = xMap[curNum]!! - 1
                yMap[curNum] = yMap[curNum]!! - 1
            } else {
                curNum--
            }
        }

        var answer:String
        if (sb.isEmpty()) {
            answer = "-1"
        } else {
            answer = sb.toString()
        }
        if (answer[0] == '0') {
            answer = "0"
        }

        return answer
    }
    fun initMap(m: MutableMap<Int, Int>) {
        for (i in 0..9) {
            m[i] = 0
        }
    }
}