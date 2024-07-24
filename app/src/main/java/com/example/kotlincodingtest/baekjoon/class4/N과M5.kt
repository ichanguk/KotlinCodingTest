package com.example.kotlincodingtest.baekjoon.class4

import java.io.BufferedReader
import java.io.BufferedWriter

private lateinit var isVisit:MutableList<Boolean>
private val bw = BufferedWriter(System.out.bufferedWriter())

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    val nums = readLine().split(' ').map { it.toInt() }.toMutableList()
    isVisit = MutableList(N){false}
    nums.sort()

    combi(nums, N, M, mutableListOf<Int>())
    bw.flush()
    bw.close()
}

private fun combi(nums: MutableList<Int>, N:Int, M:Int, curList: MutableList<Int>) {
    if (curList.size == M) {
        curList.forEach {
            bw.write("$it ")
        }
        bw.newLine()
        return
    }

    for (i in nums.indices) {
        if (!isVisit[i]) {
            isVisit[i] = true
            curList.add(nums[i])
            combi(nums, N, M, curList)
            curList.remove(nums[i])
            isVisit[i] = false
        }
    }
}