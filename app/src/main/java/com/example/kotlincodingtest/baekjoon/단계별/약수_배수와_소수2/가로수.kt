package com.example.kotlincodingtest.baekjoon.단계별.약수_배수와_소수2

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val N = readLine().toInt()
    val points = MutableList<Int>(N) { 0 }
    val distanceIntervalSet = mutableSetOf<Int>()

    points[0] = readLine().toInt()
    for (i in 1 until N) {
        points[i] = readLine().toInt()
        distanceIntervalSet.add(points[i] - points[i - 1])
    }

    var distance = 0
    val disctanceIntavalList = distanceIntervalSet.toList()
    var intervalGCD = disctanceIntavalList[0]
    for (i in 1 until disctanceIntavalList.size) {
        intervalGCD = gcd(disctanceIntavalList[i], intervalGCD)
    }

    println((points[points.size - 1] - points[0]) / intervalGCD + 1 - points.size)
}

private fun gcd(a:Int, b: Int) :Int {
    var r = 0
    var A = Math.max(a, b)
    var B = Math.min(a, b)
    while (B != 0) {
        r = A % B
        A = B
        B = r
    }
    return A
}