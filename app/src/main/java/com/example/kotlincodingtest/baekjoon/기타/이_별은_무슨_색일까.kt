package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    if (n >= 620) {
        println("Red")
    } else if (n >= 590) {
        println("Orange")
    } else if (n >= 570) {
        println("Yellow")
    } else if (n >= 495) {
        println("Green")
    } else if (n >= 450) {
        println("Blue")
    } else if (n >= 425) {
        println("Indigo")
    } else {
        println("Violet")
    }
}