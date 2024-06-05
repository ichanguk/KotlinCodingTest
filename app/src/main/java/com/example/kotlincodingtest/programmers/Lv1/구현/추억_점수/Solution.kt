package com.example.kotlincodingtest.programmers.Lv1.구현.추억_점수

class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer = IntArray(photo.size, {0})
        val yearningMap = mutableMapOf<String, Int>()

        for (i in name.indices) {
            yearningMap[name[i]] = yearning[i]
        }

        var sum:Int
        for (i in photo.indices) {
            sum = 0
            for (person in photo[i]) {
                sum += yearningMap.getOrDefault(person, 0)
            }
            answer[i] = sum
        }

        return answer
    }
}