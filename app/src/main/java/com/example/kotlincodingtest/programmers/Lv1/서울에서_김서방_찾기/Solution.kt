package com.example.kotlincodingtest.programmers.Lv1.서울에서_김서방_찾기

class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = "김서방은 "
        seoul.forEachIndexed { i, name ->
            if (name == "Kim") {
                answer += "${i}에 있다"
            }
        }
        return answer
    }
}