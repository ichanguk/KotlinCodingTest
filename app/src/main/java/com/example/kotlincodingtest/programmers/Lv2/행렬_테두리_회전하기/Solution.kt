package com.example.kotlincodingtest.programmers.Lv2.행렬_테두리_회전하기

class Solution {
    fun solution(rows: Int, columns: Int, queries: Array<IntArray>): IntArray {
        var answer = IntArray(queries.size){0}
        val m = MutableList(rows){MutableList(columns){0}}

        for (i in 0 until rows) {
            for (j in 0 until columns) {
                m[i][j] = i * columns + j + 1

            }
        }

        queries.forEachIndexed { idx, q ->
            answer[idx] = calMin(m, q)
        }
        return answer
    }
}

fun calMin(m:MutableList<MutableList<Int>>, q: IntArray):Int {
    val sx = q[0] - 1
    val sy = q[1] - 1
    val ex = q[2] - 1
    val ey = q[3] - 1

    var res = Int.MAX_VALUE
    var startN = m[sx][sy]
    for (i in sx until ex) {
        m[i][sy] = m[i + 1][sy]
        res = minOf(res, m[i][sy])
    }

    for (i in sy until ey) {
        m[ex][i] = m[ex][i + 1]
        res = minOf(res, m[ex][i])
    }

    for (i in ex downTo (sx + 1)) {
        m[i][ey] = m[i - 1][ey]
        res = minOf(res, m[i][ey])
    }

    for (i in ey downTo (sy + 1)) {
        m[sx][i] = m[sx][i - 1]
        res = minOf(res, m[sx][i])
    }
    m[sx][sy + 1] = startN
    res = minOf(res, m[sx][sy + 1])

    return res
}