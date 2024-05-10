package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var inputString = readLine()
    while (inputString != "0") {
        if (isPalindrome(inputString)) {
            println("yes")
        } else {
            println("no")
        }
        inputString = readLine()
    }
}

private fun isPalindrome(s: String) :Boolean{
    for (i in 0 until s.length / 2) {
        if (s[i] != s[s.length - 1 - i]) {
            return false
        }
    }
    return true
}