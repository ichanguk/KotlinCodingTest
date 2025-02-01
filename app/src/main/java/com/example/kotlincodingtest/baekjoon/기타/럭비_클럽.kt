package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var input = readLine().split(' ')

    while (input[0] != "#") {
        print(input[0] + ' ')
        if (input[1].toInt() > 17 || input[2].toInt() >= 80) {
            println("Senior")
        } else {
            println("Junior")
        }

        input = readLine().split(' ')
    }
}