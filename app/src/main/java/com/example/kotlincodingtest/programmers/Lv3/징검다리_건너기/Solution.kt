package com.example.kotlincodingtest.programmers.Lv3.징검다리_건너기

class Solution {
    fun solution(stones: IntArray, k: Int): Int {
        var answer = 0

        var low = 0
        var high = stones.maxOrNull()!!
        var mid:Int
        var flag:Boolean
        var cant:Int

        while (low <= high) {
            mid = (low + high) / 2
            flag = true
            cant = 0

            for (stone in stones) {
                if (stone < mid) {
                    cant++
                    if (cant == k) {
                        flag = false
                        break
                    }
                } else {
                    cant = 0
                }
            }

            if (flag) {
                answer = mid
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        return answer
    }
}