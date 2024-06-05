package com.example.kotlincodingtest.programmers.Lv1.달리기_경주

class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val playerMap = mutableMapOf<String, Int>()
        val rankMap = mutableMapOf<Int, String>()
        for (i in players.indices) {
            playerMap[players[i]] = i
            rankMap[i] = players[i]
        }

        for (calling in callings) {
            val curRank = playerMap[calling]!!
            val frontPlayer = rankMap[curRank - 1]!!

            rankMap[curRank] = frontPlayer
            rankMap[curRank - 1] = calling
            playerMap[calling] = playerMap[calling]!! - 1
            playerMap[frontPlayer] = playerMap[frontPlayer]!! + 1
        }

        var answer = Array<String>(players.size, {""})

        for (i in 0 until players.size) {
            answer[i] = rankMap[i]!!
        }

        return answer
    }
}