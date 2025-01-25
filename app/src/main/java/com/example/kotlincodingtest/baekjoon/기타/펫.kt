package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

private enum class Emotion(val message: String) {
    HAPPY(":-)"),
    SAD(":-("),
    DEAD("RIP")
}

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var cmd:List<String>
    var step = 1
    while (true) {
        var (o, w) = readLine().split(' ').map { it.toInt() }
        if (o == 0) {
            break
        }
        while (true) {
            if (checkEmotion(o, w) == Emotion.DEAD) {
                while (true) {
                    if (readLine()[0] == '#') {
                        break
                    }
                }
                break
            }
            cmd = readLine().split(' ')
            when (cmd[0]) {
                "E" -> {
                    w -= cmd[1].toInt()
                }
                "F" -> {
                    w += cmd[1].toInt()
                }
                else -> {
                    break
                }
            }
        }
        println("$step ${checkEmotion(o, w).message}")
        step++
    }
}

private fun checkEmotion(o: Int, w: Int): Emotion {
    return if (w in (o / 2 + 1) until (o * 2)) {
        Emotion.HAPPY
    } else if (w <= 0) {
        Emotion.DEAD
    } else {
        Emotion.SAD
    }
}