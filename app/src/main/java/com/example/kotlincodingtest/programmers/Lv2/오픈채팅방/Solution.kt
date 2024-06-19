package com.example.kotlincodingtest.programmers.Lv2.오픈채팅방

class Solution {
    fun solution(record: Array<String>): Array<String> {
        var answer = arrayOf<String>()
        var nameMap = mutableMapOf<String, String>()
        var result = mutableListOf<Pair<String, Boolean>>()

        record.forEach{
            var r = it.split(' ')
            when (r[0]) {
                "Enter" -> {
                    nameMap[r[1]] = r[2]
                    result.add(Pair(r[1], true))
                }
                "Change" -> {
                    nameMap[r[1]] = r[2]
                }
                else -> {
                    result.add(Pair(r[1], false))
                }
            }
        }

        result.forEach {
            if (it.second) {
                answer += nameMap[it.first] + "님이 들어왔습니다."
            } else {
                answer += nameMap[it.first] + "님이 나갔습니다."
            }
        }

        return answer
    }
}