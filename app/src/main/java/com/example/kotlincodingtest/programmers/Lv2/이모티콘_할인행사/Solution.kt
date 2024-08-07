package com.example.kotlincodingtest.programmers.Lv2.이모티콘_할인행사

class Solution {
    var cnt = 0
    var cost = 0
    var N = 0
    fun solution(users: Array<IntArray>, emoticons: IntArray): IntArray {
        N = emoticons.size

        var dcRateList = IntArray(N){0}
        dfs(dcRateList, 0, users, emoticons)

        var answer: IntArray = intArrayOf(cnt, cost)

        return answer
    }

    fun dfs(dcRateList: IntArray, s: Int, users: Array<IntArray>, emoticons: IntArray) {
        if (s == N) {
            calculate(dcRateList, users, emoticons)
            return
        }

        for (i in 1..4) {
            dcRateList[s] = i * 10
            dfs(dcRateList, s + 1, users, emoticons)
        }
    }

    fun calculate(dcRateList: IntArray, users: Array<IntArray>, emoticons: IntArray) {
        var curCnt = 0
        var curCost = 0
        users.forEach{
            val (r, p) = it
            var sum = 0
            for (i in emoticons.indices) {
                if (dcRateList[i] >= r) {
                    sum += (emoticons[i] * (100 - dcRateList[i]) * 0.01).toInt()
                }
            }
            if (sum >= p) {
                curCnt++
            } else {
                curCost += sum
            }
        }

        if (curCnt > cnt) {
            cnt = curCnt
            cost = curCost
        } else if (curCnt == cnt) {
            cost = maxOf(cost, curCost)
        }
    }
}
