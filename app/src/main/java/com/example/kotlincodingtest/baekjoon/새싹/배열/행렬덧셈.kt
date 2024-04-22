package com.example.kotlincodingtest.baekjoon.새싹.배열

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()

    val matrixA = MutableList(N) { MutableList<Int> (M) { 0 } }
    val matrixB = MutableList(N) { MutableList<Int> (M) { 0 } }

    inputMatrix(matrixA, br, N, M)
    inputMatrix(matrixB, br, N, M)

    for (i in 0 until N) {
        for (j in 0 until M) {
            print(matrixA[i][j] + matrixB[i][j])
            print(' ')
        }
        println()
    }

}

fun inputMatrix(matrix: MutableList<MutableList<Int>>, br: BufferedReader, N: Int, M: Int) {
    var st: StringTokenizer?
    for (i in 0 until N) {
        st = StringTokenizer(br.readLine())
        for (j in 0 until M) {
            matrix[i][j] = st.nextToken().toInt()
        }
    }
}