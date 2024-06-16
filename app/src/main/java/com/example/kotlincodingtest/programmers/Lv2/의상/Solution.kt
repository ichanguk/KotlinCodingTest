package com.example.kotlincodingtest.programmers.Lv2.의상

class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val clothesMap = mutableMapOf<String, Int>()
        for (c in clothes) {
            clothesMap[c[1]] = clothesMap.getOrDefault(c[1], 0) + 1
        }

        clothesMap.values.forEach {
            answer *= (it + 1)
        }

        return answer - 1
    }
}