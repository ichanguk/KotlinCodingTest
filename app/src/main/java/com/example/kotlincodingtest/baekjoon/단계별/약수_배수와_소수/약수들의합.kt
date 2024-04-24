package com.example.kotlincodingtest.baekjoon.단계별.약수_배수와_소수

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var n = readLine().toInt()

    while (n != -1) {
        perfectNum(n)
        n = readLine().toInt()
    }
}

fun perfectNum(n: Int) {
    var divisorList = MutableList<Int>(0) { 0 }
    var sum: Int = 0
    for (i in 1..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) {
            divisorList.add(i)
            sum += i
            if (n / i != i) {
                divisorList.add(n / i)
                sum += n / i
            }
        }
    }

    if (sum != 2 * n) {
        println("$n is NOT perfect.")
    } else {
        divisorList.sort()
        divisorList.removeAt(divisorList.size - 1)
        print("$n = ")
        divisorList.forEachIndexed { index, v ->
            if (index != divisorList.size - 1) {
                print("$v + ")
            } else {
                println(v)
            }
        }
    }
}
