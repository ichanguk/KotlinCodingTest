package com.example.kotlincodingtest.baekjoon.단계별.재귀

import java.io.BufferedReader
import java.util.StringTokenizer

private var cnt = 0
private var K = 0
private var res = -1

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    K = st.nextToken().toInt()
    st = StringTokenizer(readLine())
    val A = MutableList<Int>(N) { 0 }
    for (i in 0 until N) {
        A[i] = st.nextToken().toInt()
    }
    mergeSort(A, 0, N - 1)
    println(res)
}

fun mergeSort(list: MutableList<Int>, p: Int, r: Int) {
    if (p < r) {
        val q = (p + r) / 2
        mergeSort(list, p, q)
        mergeSort(list, q + 1, r)
        merge(list, p, q, r)
    }
}

fun merge(list: MutableList<Int>, p: Int, q: Int, r: Int) {
    var i = p
    var j = q + 1
    var t = 0

    val tmp = MutableList<Int>(r - p + 1) { 0 }

    while (i <= q && j <= r) {
        if (list[i] <= list[j]) {
            tmp[t++] = list[i++]

        } else {
            tmp[t++] = list[j++]
        }
    }

    while (i <= q) {
        tmp[t++] = list[i++]
    }
    while (j <= r) {
        tmp[t++] = list[j++]
    }
    i = p
    t = 0
    while (i <= r) {
        list[i++] = tmp[t++]
        cnt++
        if (cnt == K) {
            res = list[i - 1]
            break
        }
    }
}