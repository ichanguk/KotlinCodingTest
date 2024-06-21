package com.example.kotlincodingtest.programmers.Lv2.소수_찾기

import kotlin.math.sqrt

val s = mutableSetOf<Int>()

class Solution {
    fun solution(numbers: String): Int {
        var answer = 0
        val MAX_N = 10_000_000
        val isPrime = MutableList( MAX_N ) { true }
        isPrime[0] = false
        isPrime[1] = false
        for (i in 2..sqrt(MAX_N.toDouble()).toInt()) {
            if (isPrime[i]) {
                for (j in i * i until MAX_N step i) {
                    isPrime[j] = false
                }
            }
        }

        val visited = MutableList(numbers.length){false}
        dfs(numbers, "", visited)

        s.forEach {
            if (isPrime[it]) {
                answer++
            }
        }

        return answer
    }
}

fun dfs(numbers:String, cur:String, visited:MutableList<Boolean>) {
    if (cur.length > numbers.length) {
        return
    }

    for (i in numbers.indices) {
        if (!visited[i]) {
            visited[i] = true
            s.add((cur + numbers[i]).toInt())
            dfs(numbers, cur + numbers[i], visited)
            visited[i] = false
        }
    }
}