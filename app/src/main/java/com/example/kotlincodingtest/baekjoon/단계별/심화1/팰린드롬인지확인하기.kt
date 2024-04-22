package com.example.kotlincodingtest.baekjoon.단계별.심화1

import java.io.*;

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val inputString = readLine()

    println(isPalindrome(inputString))
}

fun isPalindrome(inputString: String?): Int {
    inputString?.forEachIndexed { index, c ->
        if (index >= inputString.length / 2) {
            return 1
        }
        if (inputString[index] != inputString[inputString.length - (index + 1)]) {
            return 0
        }
    }
    return 1
}
