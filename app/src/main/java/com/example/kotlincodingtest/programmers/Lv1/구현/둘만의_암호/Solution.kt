package com.example.kotlincodingtest.programmers.Lv1.구현.둘만의_암호

class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val sb = StringBuilder()

        var c:Char
        var cnt:Int
        for (i in 0 until s.length) {
            c = s[i]
            cnt = 0
            while (cnt < index) {
                c = 'a' + (c + 1 - 'a') % ('z' - 'a' + 1)
                if (!skip.contains(c)) {
                    cnt++
                }
            }
            sb.append(c)
        }

        return sb.toString()
    }
}