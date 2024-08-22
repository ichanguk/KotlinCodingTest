package com.example.kotlincodingtest.baekjoon.단계별.스택2

import java.io.BufferedReader
import java.lang.StringBuilder
import java.util.Stack

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val input = readLine()
    val bomb = readLine()

    val s = Stack<Char>()

    val poppedStack = Stack<Char>()

    var idx:Int
    var flag:Boolean

    for (c in input) {
        s.push(c)
        idx = bomb.length - 1
        flag = false
        while (s.isNotEmpty() && s.peek() == bomb[idx]) {
            poppedStack.push(s.pop())
            if (idx == 0) {
                flag = true
                poppedStack.clear()
                break
            }
            idx--
        }

        if (!flag) {
            while (poppedStack.isNotEmpty()) {
                s.push(poppedStack.pop())
            }
        }
    }

    if (s.isEmpty()) {
        println("FRULA")
    } else {
        val sb = StringBuilder()
        while (s.isNotEmpty()) {
            sb.append(s.pop())
        }
        println(sb.toString().reversed())
    }
}