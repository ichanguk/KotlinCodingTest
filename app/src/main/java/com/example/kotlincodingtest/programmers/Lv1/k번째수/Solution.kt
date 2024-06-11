package com.example.kotlincodingtest.programmers.Lv1.k번째수

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size) { 0 }

        var i = 0
        for (c in commands) {
            answer[i++] = array.sliceArray(c[0] - 1 until c[1]).sorted()[c[2] - 1]

        }
        return answer
    }
}