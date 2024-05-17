package com.example.kotlincodingtest.baekjoon.단계별.분할정복

import java.io.BufferedReader
import java.io.BufferedWriter
import kotlin.math.max

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var histogram = listOf<Int>()
    val bw = BufferedWriter(System.out.bufferedWriter())
    while (true) {
        histogram = readLine().split(' ').drop(1).map { it.toInt() }
        if (histogram.isEmpty()) {
            break
        }
        bw.write("${getMaxArea(0, histogram.size, histogram)}\n")

    }

    bw.flush()
    bw.close()

}

fun getMaxArea(s: Int, e: Int, histogram: List<Int>): Long {
    return when (s) {
        e - 1 -> histogram[s].toLong()
        else -> {
            val m = (s + e) / 2
            val leftMaxArea = getMaxArea(s, m, histogram)
            val rightMaxArea = getMaxArea(m, e, histogram)
            val midMaxArea = getMidMaxArea(s, e, m, histogram)
            max(max(leftMaxArea, rightMaxArea), midMaxArea)
        }

    }
}

fun getMidMaxArea(s: Int, e: Int, m: Int, histogram: List<Int>): Long {
    var l = m
    var h = m
    val last = e - 1

    var height = histogram[m].toLong()
    var maxArea = height


    while (s < l && h < last) {
        if (height == 0L || maxArea > (e - s) * height) {
            return maxArea
        }
        val curHeight =
            if (histogram[l - 1] >= histogram[h + 1]) {
                histogram[--l].toLong()
            } else {
                histogram[++h].toLong()
            }
        if (curHeight < height) {
            height = curHeight
        }
        val width = h - l + 1
        val area = height * width
        if (area > maxArea) {
            maxArea = area
        }
    }

    while (s < l) {
        if (height == 0L || maxArea > (e - s) * height) {
            return maxArea
        }
        val curHeight = histogram[--l].toLong()
        if (curHeight < height) {
            height = curHeight
        }
        val width = h - l + 1
        val area = height * width
        if (area > maxArea) {
            maxArea = area
        }
    }

    while (h < last) {
        if (height == 0L || maxArea > (e - s) * height) {
            return maxArea
        }
        val curHeight = histogram[++h].toLong()
        if (curHeight < height) {
            height = curHeight
        }
        val width = h - l + 1
        val area = height * width
        if (area > maxArea) {
            maxArea = area
        }
    }
    return maxArea
}