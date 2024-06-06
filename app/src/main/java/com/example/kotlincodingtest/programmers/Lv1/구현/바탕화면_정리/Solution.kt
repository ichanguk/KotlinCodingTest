package com.example.kotlincodingtest.programmers.Lv1.구현.바탕화면_정리

class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var h = wallpaper.size
        var w = wallpaper[0].length
        var sx = h
        var sy = w
        var ex = 0
        var ey = 0

        for (i in 0 until h) {
            for (j in 0 until w) {
                if (wallpaper[i][j] == '#') {
                    if (i < sx) {
                        sx = i
                    }
                    if (i > ex) {
                        ex = i
                    }
                    if (j < sy) {
                        sy = j
                    }
                    if (j > ey) {
                        ey = j
                    }
                }
            }
        }

        var answer: IntArray = intArrayOf(sx , sy, ex + 1, ey + 1)

        return answer
    }
}