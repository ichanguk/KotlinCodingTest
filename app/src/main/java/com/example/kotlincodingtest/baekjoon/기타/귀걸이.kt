package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var n = readLine().toInt()
    var i = 1
    while (n != 0) {
        val name = mutableListOf<String>()
        repeat(n) {
            name.add(readLine())
        }

        val aSet = mutableSetOf<Int>()
        val bSet = mutableSetOf<Int>()

        repeat(2 * n - 1) {
            val (num, group) = readLine().split(' ')
            when (group) {
                "A" -> aSet.add(num.toInt())
                "B" -> bSet.add(num.toInt())
            }
        }

        if (aSet.size > bSet.size) {
            println("$i " + name[(aSet - bSet).first() - 1])
        } else {
            println("$i " + name[(bSet - aSet).first() - 1])
        }

        n = readLine().toInt()
        i++
    }
}