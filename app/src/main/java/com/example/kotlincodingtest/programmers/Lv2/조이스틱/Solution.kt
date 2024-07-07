package com.example.kotlincodingtest.programmers.Lv2.조이스틱

class Solution {
    fun solution(name: String): Int {
        var updown = 0
        var len = name.length
        var lr = len - 1
        var e = 0

        for (i in name.indices) {
            updown += minOf(name[i] - 'A', 26 - (name[i] - 'A'))
            if (i < len - 1 && name[i + 1] == 'A') {
                e = i + 1
                while (e < len && name[e] == 'A') {
                    e++
                }
                lr = minOf(minOf(lr, i * 2 + len - e), i + (len - e) * 2)
            }
        }

        return updown + lr
    }
}