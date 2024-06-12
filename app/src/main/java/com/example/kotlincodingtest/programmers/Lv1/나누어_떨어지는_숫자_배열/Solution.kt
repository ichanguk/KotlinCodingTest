package com.example.kotlincodingtest.programmers.Lv1.나누어_떨어지는_숫자_배열

class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val k = arr.sorted().filter {it % divisor == 0}
        if (k.size == 0) {
            return intArrayOf(-1)
        } else {
            return k.toIntArray()
        }
    }
}