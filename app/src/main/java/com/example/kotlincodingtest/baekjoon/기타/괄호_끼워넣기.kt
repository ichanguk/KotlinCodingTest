package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.util.Stack

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val input = readLine()
    var answer = 0

    val s = Stack<Char>()

    for (c in input) {
        if (c == '(') {
            s.push(c)
        } else {
            if (s.isNotEmpty() && s.peek() == '(') {
                s.pop()
            } else {
                answer++
            }
        }
    }

    answer += s.size
    println(answer)

}