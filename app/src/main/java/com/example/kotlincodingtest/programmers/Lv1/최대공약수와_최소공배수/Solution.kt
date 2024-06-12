package com.example.kotlincodingtest.programmers.Lv1.최대공약수와_최소공배수

class Solution {
    fun solution(n: Int, m: Int): IntArray {
        return intArrayOf(gcd(n, m), lcm(n, m))
    }
}

fun gcd(n: Int, m: Int): Int {
    var a = if (n >= m) n else m
    var b = if (n >= m) m else n
    var c = 0

    while (b > 0) {
        c = a % b
        a = b
        b = c
    }
    return a
}

fun lcm(n: Int, m: Int): Int {
    return n * m / gcd(n, m)
}