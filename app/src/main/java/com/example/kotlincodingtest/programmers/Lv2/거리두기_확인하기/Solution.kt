package com.example.kotlincodingtest.programmers.Lv2.거리두기_확인하기

class Solution {
    fun solution(places: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()

        loop@ for (p in places) {
            for (i in 0 until 5) {
                for (j in 0 until 5) {
                    if (p[i][j] == 'P') {
                        if (!isSafe(p, i, j)) {
                            answer += 0
                            continue@loop
                        }
                    }
                }
            }
            answer += 1
        }

        return answer
    }
}

val dx = listOf(-1, 0, 1, 0)
val dy = listOf(0, 1, 0, -1)

fun isSafe(p: Array<String>, sx: Int, sy: Int): Boolean {
    var nx = 0
    var ny = 0
    var nnx = 0
    var nny = 0

    for (i in 0 until 4) {
        nx = sx + dx[i]
        ny = sy + dy[i]
        if (nx in 0 until 5 && ny in 0 until 5) {
            if (p[nx][ny] == 'P') {
                return false
            } else if (p[nx][ny] == 'O') {
                for (j in 0 until 4) {
                    if ((i != j) && (i + j) % 2 == 0) {
                        continue
                    }
                    nnx = nx + dx[j]
                    nny = ny + dy[j]
                    if (nnx in 0 until 5 && nny in 0 until 5) {
                        if (p[nnx][nny] == 'P') {
                            return false
                        }
                    }
                }
            }
        }
    }
    return true
}