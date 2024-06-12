package com.example.kotlincodingtest.programmers.Lv1.약수의_합

class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        var i = 1
        while (i * i <= n) {
            if (i * i == n) {
                answer += i
            } else if (n % i == 0) {
                answer += i + n / i
            }
            i++
        }

        return answer
    }
}