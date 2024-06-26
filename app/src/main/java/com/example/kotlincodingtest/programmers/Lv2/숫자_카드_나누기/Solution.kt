package com.example.kotlincodingtest.programmers.Lv2.숫자_카드_나누기

var answer: Int = 0

class Solution {
    fun solution(arrayA: IntArray, arrayB: IntArray): Int {
        findAllDivideNum(arrayA, arrayB)
        findAllDivideNum(arrayB, arrayA)

        return answer
    }
}

fun findAllDivideNum(arr1:IntArray, arr2:IntArray) {
    val endNum = arr1.minOrNull()
    var flag1 = true
    var flag2 = true
    for (i in endNum!! downTo 2) {
        flag1 = true
        for (n in arr1) {
            if (n % i != 0) {
                flag1 = false
                break
            }
        }
        if (flag1) {
            flag2 = true
            for (n in arr2) {
                if (n % i == 0) {
                    flag2 = false
                    break
                }
            }
            if (flag2) {
                answer = maxOf(answer, i)
                break
            }
        }
    }
}