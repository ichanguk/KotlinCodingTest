package com.example.kotlincodingtest.baekjoon.단계별.스택_큐_덱

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.Stack

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var inputString = readLine()
    val s = Stack<Char>()
    val bw = BufferedWriter(System.out.bufferedWriter())

    var flag = false
    while (inputString != ".") {
        flag = false
        for (i in inputString.indices) {
            if (inputString[i] == '(' || inputString[i] == '{' || inputString[i] == '[') {
                s.push(inputString[i])
            } else if (inputString[i] == ')') {
                if (s.empty() || s.pop() != '(') {
                    bw.write("no\n")
                    flag = true
                    break
                }
            } else if (inputString[i] == '}') {
                if (s.empty() || s.pop() != '{') {
                    bw.write("no\n")
                    flag = true
                    break
                }
            } else if (inputString[i] == ']') {
                if (s.empty() || s.pop() != '[') {
                    bw.write("no\n")
                    flag = true
                    break
                }
            }
        }
        if (!flag) {
            if (s.empty()) {
                bw.write("yes\n")
            } else {
                bw.write("no\n")
            }
        }

        inputString = readLine()
        s.clear()
    }
    bw.flush()
    bw.close()
}