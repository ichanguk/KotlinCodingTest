package com.example.kotlincodingtest.programmers.Lv1.가장_많이_받은_선물

class Solution {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        var answer: Int = 0
        var N = friends.size

        var friendMap = mutableMapOf<String, Int>()
        for (i in friends.indices) {
            friendMap[friends[i]] = i
        }

        val giftList = MutableList(N) { MutableList(N) {0}}

        for (gift in gifts) {
            val (give, take) = gift.split(' ')
            giftList[friendMap[give]!!][friendMap[take]!!]++
        }

        val giftIndex = MutableList(N) { 0 }
        var curPerson:String
        for (i in 0 until N) {
            for (j in 0 until N) {
                giftIndex[i] += giftList[i][j]
                giftIndex[i] -= giftList[j][i]
            }
        }

        val giftTakeList = MutableList(N) { 0 }
        var giveCnt:Int
        var takeCnt:Int
        for (i in 0 until N) {
            for (j in (i + 1) until N) {
                giveCnt = giftList[i][j]
                takeCnt = giftList[j][i]
                if (giveCnt > takeCnt) {
                    giftTakeList[i]++
                } else if (giveCnt < takeCnt) {
                    giftTakeList[j]++
                } else {
                    if (giftIndex[i] > giftIndex[j]) {
                        giftTakeList[i]++
                    } else if (giftIndex[j] > giftIndex[i]) {
                        giftTakeList[j]++
                    }
                }
            }
        }

        return giftTakeList.maxOrNull()!!
    }
}