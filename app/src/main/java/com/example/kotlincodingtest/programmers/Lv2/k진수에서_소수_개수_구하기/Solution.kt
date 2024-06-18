package com.example.kotlincodingtest.programmers.Lv2.k진수에서_소수_개수_구하기

import kotlin.math.sqrt

class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        val nToK = n.toString(k)

        val sb = StringBuilder()
        for (c in nToK) {
            if (c == '0') {
                if (sb.isNotEmpty() && isPrime(sb.toString().toLong())) {
                    answer++
                }
                sb.clear()
            } else {
                sb.append(c)
            }
        }
        if (sb.isNotEmpty() && isPrime(sb.toString().toLong())) {
            answer++
        }


        return answer
    }
}

fun isPrime(n:Long):Boolean {
    if (n == 1L) {
        return false
    }
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0L) {
            return false
        }
    }
    return true
}