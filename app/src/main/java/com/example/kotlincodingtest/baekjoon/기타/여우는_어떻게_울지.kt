package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val t = readLine().toInt()
    repeat(t) {
        val input = readLine().split(' ')
        var sound = readLine().split(' ')
        val soundMap = mutableMapOf<String, String>()
        while (sound.size == 3) {
            soundMap[sound[2]] = sound[0]

            sound = readLine().split(' ')
        }

        input.forEach {
            if (!soundMap.containsKey(it)) {
                print("$it ")
            }
        }
        println()
    }
}