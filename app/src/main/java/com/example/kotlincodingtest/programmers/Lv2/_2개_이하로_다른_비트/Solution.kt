package com.example.kotlincodingtest.programmers.Lv2._2개_이하로_다른_비트

class Solution {
    fun solution(numbers: LongArray): LongArray {
        var answer = LongArray(numbers.size){ 0L }
        var bitNum:CharArray
        numbers.forEachIndexed{ idx, n ->
            bitNum = ("0" + n.toString(2)).toCharArray()
            for (i in bitNum.size - 1 downTo 0) {
                if (bitNum[i] == '0') {
                    bitNum[i] = '1'
                    if (i + 1 < bitNum.size) {
                        bitNum[i + 1] = '0'
                    }
                    break
                }
            }

            answer[idx] = String(bitNum).toLong(2)
        }
        return answer
    }
}