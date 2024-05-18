package com.example.kotlincodingtest.baekjoon.단계별.이분탐색

import java.io.BufferedReader
import java.io.BufferedWriter

private var A = mutableListOf<Int>()
private var N = 0
fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    N = readLine().toInt()
    A = readLine().split(' ').map { it.toInt() }.toMutableList()
    A.sort()
    val M = readLine().toInt()
    val numList = readLine().split(' ').map { it.toInt() }

    val bw = BufferedWriter(System.out.bufferedWriter())
    numList.forEach {
        bw.write("${binarySearch(it)}\n")
    }
    bw.flush()
    bw.close()
}

fun binarySearch(n: Int): Int {
    var low = 0
    var high = N - 1
    var mid = (low + high) / 2
    while (low <= high) {
        if (A[mid] == n) {
            return 1
        }
        if (A[mid] < n) {
            low = mid + 1
        } else {
            high = mid - 1
        }
        mid = (low + high) / 2
    }
    return 0
}