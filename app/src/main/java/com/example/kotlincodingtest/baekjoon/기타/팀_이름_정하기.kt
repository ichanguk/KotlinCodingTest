package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val name = readLine()
    val initScore = countLove(name)
    val n = readLine().toInt()

    var ans = readLine()
    var maxScore = countScore(initScore, countLove(ans))
    repeat(n - 1) {
        val teamName = readLine()
        val teamScore = countLove(teamName)

        val score = countScore(initScore, teamScore)

        if (score > maxScore) {
            maxScore = score
            ans = teamName
        } else if (score == maxScore) {
            ans = if (ans < teamName) ans else teamName
        }
    }

    println(ans)
}

private fun countLove(name: String): IntArray {
    return intArrayOf(name.count { it == 'L' },
        name.count { it == 'O' },
        name.count { it == 'V' },
        name.count { it == 'E' })
}

private fun countScore(initScore: IntArray, teamScore: IntArray): Int {
    val loveMap = mapOf(
        'L' to initScore[0] + teamScore[0],
        'O' to initScore[1] + teamScore[1],
        'V' to initScore[2] + teamScore[2],
        'E' to initScore[3] + teamScore[3]
    )
    return ((loveMap['L']!! + loveMap['O']!!) * (loveMap['L']!! + loveMap['V']!!) *
            (loveMap['L']!! + loveMap['E']!!) * (loveMap['O']!! + loveMap['V']!!) *
            (loveMap['O']!! + loveMap['E']!!) * (loveMap['V']!! + loveMap['E']!!)) % 100
}