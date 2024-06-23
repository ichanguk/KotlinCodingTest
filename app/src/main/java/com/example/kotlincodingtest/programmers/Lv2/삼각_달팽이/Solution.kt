package com.example.kotlincodingtest.programmers.Lv2.삼각_달팽이

class Solution {
    fun solution(n: Int): IntArray {
        val answer = MutableList(n) {mutableListOf(0)}
        answer.forEachIndexed { idx, arr ->
            answer[idx] = MutableList(idx + 1) { 0 }
        }

        var cnt = n
        var r = 0
        var c = 0
        var cur = 1
        while (cnt > 0) {
            repeat(cnt) {
                answer[r++][c] = cur++
            }
            cnt--
            r--
            c++
            repeat(cnt) {
                answer[r][c++] = cur++
            }
            cnt--
            r--
            c -= 2
            repeat(cnt) {
                answer[r--][c--] = cur++
            }
            cnt--
            r += 2
            c++
        }


        return answer.flatten().toIntArray()
    }
}
