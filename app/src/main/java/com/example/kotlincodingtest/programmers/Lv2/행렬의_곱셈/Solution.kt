package com.example.kotlincodingtest.programmers.Lv2.행렬의_곱셈

class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val N = arr1.size
        val M = arr2[0].size
        val K = arr2.size
        var answer = Array(N) {IntArray(M){0}}

        for (i in 0 until N) {
            for (j in 0 until M) {
                for (k in 0 until K) {
                    answer[i][j] += arr1[i][k] * arr2[k][j]
                }
            }
        }
        return answer
    }
}

