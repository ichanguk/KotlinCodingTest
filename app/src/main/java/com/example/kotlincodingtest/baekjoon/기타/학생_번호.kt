package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val nums = Array<String>(n) { " "}

    repeat(n){
        nums[it] = readLine()
    }

    val len = nums[0].length
    var ans = len
    for (i in 1 until len) {
        val s = mutableSetOf<String>()
        for (num in nums) {
            s.add(num.substring(len - i, len))
        }

        if (s.size == n) {
            ans = i
            break
        }
    }

    println(ans)

}