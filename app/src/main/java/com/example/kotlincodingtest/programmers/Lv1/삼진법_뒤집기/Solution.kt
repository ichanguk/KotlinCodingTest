package com.example.kotlincodingtest.programmers.Lv1.삼진법_뒤집기

class Solution {
    fun solution(n: Int): Int {
        var answer = tenToThree(n)

        return threeToTen(answer)
    }

    fun tenToThree(N: Int): String {
        var n = N
        val sb = StringBuilder()
        while (n > 0) {
            sb.append(n % 3)
            n /= 3
        }
        return sb.toString().toLong().toString().reversed()
    }

    fun threeToTen(N: String): Int {
        var answer = 0
        for (i in N.indices) {
            answer += (Math.pow(3.0, i.toDouble()) * (N[i] - '0')).toInt()
        }
        return answer
    }

}