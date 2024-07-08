package com.example.kotlincodingtest.programmers.Lv2.멀쩡한_사각형

class Solution {
    fun solution(w: Int, h: Int): Long {
        return w.toLong() * h - (w + h - gcd(w.toLong(), h.toLong()))
    }
}

fun gcd(A:Long, B:Long):Long {
    var a = if (A >= B) A else B
    var b = if (A >= B) B else A
    var c = 0L

    while (b != 0L) {
        c = a % b
        a = b
        b = c
    }
    return a
}