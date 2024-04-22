package com.example.kotlincodingtest.baekjoon.단계별.심화1

import java.io.*

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var inputString = readLine()
    var score: Double = 0.0
    var credit: Double = 0.0
    var creditSum: Double = 0.0
    var grade:String? = null

    val gradeMap = mapOf(
        "A+" to 4.5, "A0" to 4.0, "B+" to 3.5,
        "B0" to 3.0, "C+" to 2.5, "C0" to 2.0,
        "D+" to 1.5, "D0" to 1.0, "F" to 0.0,
        )

    while (!inputString.isNullOrEmpty()) {
        credit = inputString.trim().split(" ")[1].toDouble()
        grade = inputString.trim().split(" ")[2]
        if (grade.equals("P")) {
            inputString = readLine()
            continue
        }

        creditSum += credit
        score += credit * gradeMap[grade]!!

        inputString = readLine()
    }

    println(score / creditSum)
}