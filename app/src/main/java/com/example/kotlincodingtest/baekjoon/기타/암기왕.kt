package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val t = readLine().toInt()
    var st:StringTokenizer
    val bw = BufferedWriter(System.out.bufferedWriter())
    repeat(t) {
        val n = readLine().toInt()
        val nums = mutableMapOf<Int, Boolean>()
        st = StringTokenizer(readLine())

        repeat(n) {
            nums[st.nextToken().toInt()] = true
        }

        val m = readLine().toInt()

        st = StringTokenizer(readLine())
        repeat(m) {
            if (nums[st.nextToken().toInt()] != null) {
                bw.write("1\n")
            } else {
                bw.write("0\n")
            }
        }
    }
    bw.flush()
    bw.close()
}