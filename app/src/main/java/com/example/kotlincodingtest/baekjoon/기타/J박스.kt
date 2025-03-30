package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    repeat(readLine().toInt()) {
        val n = readLine().toInt()

        repeat(n) {
            print('#')
        }
        println()

        repeat(n - 2) {
            print('#')
            repeat(n - 2) {
                print('J')
            }
            println('#')
        }

        if (n > 1) {
            repeat(n) {
                print('#')
            }
        }
        println()
        if (it < n - 1) {
            println()
        }
    }
}