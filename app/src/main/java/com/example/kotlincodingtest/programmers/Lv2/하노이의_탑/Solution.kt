package com.example.kotlincodingtest.programmers.Lv2.하노이의_탑

import kotlin.math.pow

var answer = arrayOf<IntArray>()
var idx = 0

class Solution {
    fun solution(n: Int): Array<IntArray> {
        answer = Array(2.0.pow(n).toInt() - 1){intArrayOf(0, 0)}
        hanoi(n, 1, 3)
        return answer
    }
}

fun hanoi(n:Int, src:Int, dest:Int) {
    if (n == 1) {
        answer[idx][0] = src
        answer[idx++][1] = dest
        return
    }
    hanoi(n - 1, src, 6 - src - dest)
    hanoi(1, src, dest)
    hanoi(n - 1, 6 - src - dest, dest)
}