package com.example.kotlincodingtest.programmers.Lv2.N개의_최소공배수

class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 0
        if (arr.isEmpty()) {
            return arr[0]
        }
        arr.sort()
        answer = lcm(arr[0], arr[1])
        for (i in 1 until arr.size) {
            answer = lcm(answer, arr[i])
        }
        return answer
    }
}

fun gcd(A: Int, B: Int): Int {
    var a = A
    var b = B
    var c = 0
    while (b > 0) {
        c = a % b
        a = b
        b = c
    }
    return a
}

fun lcm(A: Int, B: Int): Int {
    return A * B / gcd(A, B)
}