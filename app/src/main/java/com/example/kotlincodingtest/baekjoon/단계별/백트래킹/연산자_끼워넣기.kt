package com.example.kotlincodingtest.baekjoon.단계별.백트래킹

import java.io.BufferedReader
import java.util.StringTokenizer

private var operands = listOf<Int>()
private val operatorMap = mutableMapOf("plus" to 0, "minus" to 0, "multiply" to 0, "divide" to 0)
private val results = mutableSetOf<Long>()
private var operatorCnt = 0
private var N = 0

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    N = readLine().toInt()
    operands = readLine().split(' ').map { it.toInt() }
    val st = StringTokenizer(readLine())
    operatorMap["plus"] = st.nextToken().toInt()
    operatorCnt += operatorMap["plus"]!!
    operatorMap["minus"] = st.nextToken().toInt()
    operatorCnt += operatorMap["minus"]!!
    operatorMap["multiply"] = st.nextToken().toInt()
    operatorCnt += operatorMap["multiply"]!!
    operatorMap["divide"] = st.nextToken().toInt()
    operatorCnt += operatorMap["divide"]!!

    insertOperator(operands[0].toLong(), 1)
    println(results.max())
    println(results.min())
}

fun insertOperator(tmp: Long, curIdx: Int) {
    if (curIdx == N) {
        results.add(tmp)
        return
    }
    if (operatorMap["plus"] != 0) {
        operatorMap["plus"] = operatorMap["plus"]!! - 1
        insertOperator(tmp + operands[curIdx], curIdx + 1)
        operatorMap["plus"] = operatorMap["plus"]!! + 1
    }
    if (operatorMap["minus"] != 0) {
        operatorMap["minus"] = operatorMap["minus"]!! - 1
        insertOperator(tmp - operands[curIdx], curIdx + 1)
        operatorMap["minus"] = operatorMap["minus"]!! + 1
    }
    if (operatorMap["multiply"] != 0) {
        operatorMap["multiply"] = operatorMap["multiply"]!! - 1
        insertOperator(tmp * operands[curIdx], curIdx + 1)
        operatorMap["multiply"] = operatorMap["multiply"]!! + 1
    }
    if (operatorMap["divide"] != 0) {
        operatorMap["divide"] = operatorMap["divide"]!! - 1
        if (tmp < 0) {
            insertOperator((-1) * ((-1) * tmp / operands[curIdx]), curIdx + 1)
        } else {
            insertOperator(tmp / operands[curIdx], curIdx + 1)
        }
        operatorMap["divide"] = operatorMap["divide"]!! + 1
    }
}



