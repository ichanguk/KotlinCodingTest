package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var n = 0
    for (i in 0 until 3) {
        try {
            n = readLine().toInt() + (3 - i)
            break
        } catch (e: Exception) {
            continue
        }
    }

    if (n % 3 == 0 && n % 5 == 0) {
        println("FizzBuzz")
    } else if (n % 3 == 0) {
        println("Fizz")
    } else if (n % 5 == 0) {
        println("Buzz")
    } else {
        println(n)
    }
}