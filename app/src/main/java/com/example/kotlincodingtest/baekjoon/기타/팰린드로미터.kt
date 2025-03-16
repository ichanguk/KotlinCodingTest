package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var input = readLine()

    while (input != "0") {
        var cnt = 0
        var km = input
        while (!isPalindrome(km)) {
            km = plusOne(km)
            cnt++
        }
        println(cnt)

        input = readLine()
    }

}

private fun isPalindrome(st: String): Boolean {
    for (i in 0 until st.length / 2) {
        if (st[i] != st[st.length - i - 1]) {
            return false
        }
    }

    return true
}

private fun plusOne(st: String): String {
    return (st.toInt() + 1).toString().padStart(st.length, '0')
}