package com.example.kotlincodingtest.programmers.Lv1.행렬의_덧셈

class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val r = arr1.size
        val c = arr1[0].size

        for (i in 0 until r) {
            for (j in 0 until c) {
                arr1[i][j] += arr2[i][j]
            }
        }
        return arr1
    }
}