package com.example.kotlincodingtest.baekjoon.단계별.투포인터

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    if (n == 1) {
        println(0)
        return@with
    } else if (n == 2) {
        println(1)
        return@with
    }
    val isPrime = BooleanArray(n + 1) { true }

    isPrime[0] = false
    isPrime[1] = false

    var i = 2
    while (i * i <= n) {
        for (j in (i + i)..n step i) {
            isPrime[j] = false
        }
        i++
    }

    val primeNums = mutableListOf<Int>()

    isPrime.forEachIndexed{ idx, v ->
        if (v) {
            primeNums.add(idx)
        }
    }

    var s = 0
    var e = 0
    var sum = primeNums[s]
    var ans = 0

    while (true) {
        if (sum < n) {
            e++
            if (e >= primeNums.size) {
                break
            }
            sum += primeNums[e]
        } else {
            sum -= primeNums[s]
            s++
        }

        if (sum == n) {
            ans++
        }
    }

    println(ans)

}