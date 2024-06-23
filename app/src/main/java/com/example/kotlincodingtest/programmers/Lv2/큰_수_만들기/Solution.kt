package com.example.kotlincodingtest.programmers.Lv2.큰_수_만들기

class Solution {
    fun solution(number: String, k: Int): String {
        var cnt = k + 1
        var i = 0

        var curMax:Char
        var maxIdx:Int

        val sb = StringBuilder()
        while (sb.length < number.length - k) {
            if (cnt == 1) {
                sb.append(number.slice(i until number.length))
                break
            }
            curMax = number[i]
            maxIdx = i
            for (j in (i + 1) until (i + cnt)) {
                if (number[j] > curMax) {
                    curMax = number[j]
                    maxIdx = j
                }
            }

            sb.append(curMax)
            cnt -= maxIdx - i
            i = maxIdx + 1
        }

        return sb.toString()
    }
}