package com.example.kotlincodingtest.baekjoon.단계별.분할정복

import java.io.BufferedReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val B = st.nextToken().toLong()

    val mat = MutableList(N) { MutableList(N) { 0L } }
    for (i in 0 until N) {
        mat[i] = readLine().split(' ').map { it.toLong() }.toMutableList()
    }

    matPower(mat, B).forEach {
        it.forEach {
            print("$it ")
        }
        println()
    }

}

fun matPower(mat: MutableList<MutableList<Long>>, b: Long): MutableList<MutableList<Long>> {
    if (b == 1L) {
        return modMat(mat)
    }
    val divRes = matPower(mat, b / 2)

    if (b % 2 == 1L) {
        return matMultiply(matMultiply(divRes, divRes), mat)
    } else {
        return matMultiply(divRes, divRes)
    }
}

fun matMultiply(matA: MutableList<MutableList<Long>>, matB:MutableList<MutableList<Long>>): MutableList<MutableList<Long>> {
    val res = MutableList(matA.size) { MutableList(matB.size) { 0L } }
    for (i in 0 until matA.size) {
        for (j in 0 until matB.size) {
            for (k in 0 until matA[0].size) {
                res[i][j] += matA[i][k] * matB[k][j]
            }
        }
    }
    return modMat(res)
}

fun modMat(mat: MutableList<MutableList<Long>>): MutableList<MutableList<Long>> {
    for (i in 0 until mat.size) {
        for (j in 0 until mat.size) {
            mat[i][j] = mat[i][j] % 1000
        }
    }
    return mat
}
