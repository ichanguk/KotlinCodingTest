package com.example.kotlincodingtest.baekjoon.입력과계산

import java.io.BufferedReader
import java.util.StringTokenizer

// 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.

fun main() = with(BufferedReader(System.`in`.bufferedReader())){
    val st = StringTokenizer(readLine())
    val A: Int = st.nextToken().toInt()
    val B: Int = st.nextToken().toInt()

    println(A + B)
    println(A - B)
    println(A * B)
    println(A / B)
    println(A % B)
}