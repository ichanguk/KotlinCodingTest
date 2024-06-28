package com.example.kotlincodingtest.programmers.Lv2.무인도_여행

var cnt = 0
var N = 0
var M = 0

class Solution {
    fun solution(maps: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        N = maps.size
        M = maps[0].length
        val isVisit = MutableList(N) { MutableList(M) { false } }

        for (i in 0 until N) {
            for (j in 0 until M) {
                if (!isVisit[i][j]) {
                    if (maps[i][j] == 'X') {
                        isVisit[i][j] = true
                    } else {
                        cnt = 0
                        dfs(i, j, maps, isVisit)
                        answer += cnt
                    }
                }
            }
        }
        if (answer.size == 0) {
            return intArrayOf(-1)
        } else {
            return answer.sortedArray()
        }
    }
}

val dx = mutableListOf(-1, 0, 1, 0)
val dy = mutableListOf(0, 1, 0, -1)
var nx = 0
var ny = 0

fun dfs(x: Int, y: Int, maps: Array<String>, isVisit: MutableList<MutableList<Boolean>>) {
    isVisit[x][y] = true
    cnt += maps[x][y] - '0'

    for (i in 0 until 4) {
        nx = x + dx[i]
        ny = y + dy[i]
        if (nx in 0 until N && ny in 0 until M && !isVisit[nx][ny]) {
            if (maps[nx][ny] != 'X') {
                dfs(nx, ny, maps, isVisit)
            } else {
                isVisit[nx][ny] = true
            }
        }
    }


}