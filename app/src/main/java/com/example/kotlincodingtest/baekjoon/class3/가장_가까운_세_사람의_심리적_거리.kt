package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    repeat(readLine().toInt()) {
        val N = readLine().toInt()
        val MBTIList = readLine().split(' ')
        var res = 12
        val MBTIMap = mutableMapOf("ESTJ" to 0, "ESTP" to 0, "ESFJ" to 0, "ESFP" to 0,
            "ENTJ" to 0, "ENTP" to 0, "ENFJ" to 0, "ENFP" to 0,
            "ISTJ" to 0, "ISTP" to 0, "ISFJ" to 0, "ISFP" to 0,
            "INTJ" to 0, "INTP" to 0, "INFJ" to 0, "INFP" to 0
        )

        for (i in 0 until N) {
            MBTIMap[MBTIList[i]] = MBTIMap[MBTIList[i]]!! + 1
            if (MBTIMap[MBTIList[i]] == 3) {
                res = 0
                break
            }
        }
        if (res == 0) {
            println(res)
        } else {
            val finalList = mutableListOf<String>()
            MBTIMap.forEach { k, v ->
                repeat (v) {
                    finalList.add(k)
                }
            }
            val size = finalList.size
            var tmp = 0
            for (i in 0 until size - 2) {
                for (j in i + 1 until size - 1) {
                    for (k in j + 1 until size) {
                        tmp = calDist(finalList[i], finalList[j], finalList[k])
                        if (tmp < res) {
                            res = tmp
                        }
                    }
                }
            }
            println(res)
        }
    }
}

private fun calDist(mbti1: String, mbti2: String, mbti3: String):Int {
    return calDist2(mbti1, mbti2) + calDist2(mbti2, mbti3) + calDist2(mbti1, mbti3)
}

private fun calDist2(mbti1: String, mbti2: String): Int {
    var cnt = 0
    for (i in 0 until 4) {
        if (mbti1[i] != mbti2[i]) {
            cnt++
        }
    }
    return cnt
}