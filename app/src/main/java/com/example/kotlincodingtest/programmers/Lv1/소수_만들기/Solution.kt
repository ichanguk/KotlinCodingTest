package com.example.kotlincodingtest.programmers.Lv1.소수_만들기

class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        val N = nums.size
        val maxNum = 3000

        val isPrime = MutableList(maxNum + 1) { true }
        isPrime[0] = false
        isPrime[1] = false

        var i = 2
        while (i * i <= maxNum) {
            if (isPrime[i]) {
                for (j in i * i..maxNum step i) {
                    isPrime[j] = false
                }
            }
            i++
        }

        var sum:Int
        for (i in 0 until (N - 2)) {
            for (j in (i + 1) until (N - 1)) {
                for (k in (j + 1) until N) {
                    sum = nums[i] + nums[j] + nums[k]
                    if (isPrime[sum]) {
                        answer++
                    }
                }
            }
        }

        return answer
    }
}