package com.example.kotlincodingtest.programmers.Lv2.괄호_회전하기

var N = 0

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0

        N = s.length
        var input = s

        for (i in 0 until N) {
            if (isRight(input)) {
                answer++
            }
            input = (input + input[0]).drop(1)

        }

        return answer
    }
}

fun isRight(s: String):Boolean {
    val dq = ArrayDeque<Char>()
    var curChar:Char

    for (i in 0 until N) {
        if (dq.isEmpty()) {
            dq.addLast(s[i])
            continue
        }
        curChar = s[i]
        if ((dq.last() == '(' && curChar == ')') ||
            (dq.last() == '{' && curChar == '}') ||
            (dq.last() == '[' && curChar == ']')) {
            dq.removeLast()
            continue
        }
        dq.addLast(curChar)
    }
    return dq.isEmpty()
}