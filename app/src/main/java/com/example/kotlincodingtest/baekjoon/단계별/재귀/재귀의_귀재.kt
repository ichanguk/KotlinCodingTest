package com.example.kotlincodingtest.baekjoon.단계별.재귀

import java.io.BufferedReader

private var cnt = 0

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()
    for (i in 1..T) {
        cnt = 0
        println("${isPalindrome(readLine())} $cnt")
    }
}

fun isPalindrome(s: String): Int {
    return recursion(s, 0, s.length - 1)
}

fun recursion(s: String, l: Int, r: Int): Int {
    cnt++
    if (l >= r) {
        return 1
    } else if (s[l] != s[r]) {
        return 0
    } else {
        return recursion(s, l + 1, r - 1)
    }
}
