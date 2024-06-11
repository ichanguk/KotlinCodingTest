package com.example.kotlincodingtest.programmers.Lv1.두_개_뽑아서_더하기

class Solution {
    fun solution(numbers: IntArray): IntArray {
        val N = numbers.size
        var resultSet = mutableSetOf<Int>()
        for (i in 0 until (N - 1)) {
            for (j in i + 1 until N) {
                resultSet.add(numbers[i] + numbers[j])
            }
        }

        return resultSet.sorted().toIntArray()
    }
}