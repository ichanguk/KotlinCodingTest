package com.example.kotlincodingtest.baekjoon.단계별.트리

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    var cnt = 1
    while( true ) {
        val (n, m) = readLine().split(' ').map { it.toInt() }

        if (n == 0 && m == 0) {
            break
        }

        val g = MutableList(n + 1) { mutableListOf<Int>() }

        repeat(m) {
            val (a, b) = readLine().split(' ').map { it.toInt() }
            g[a].add(b)
            g[b].add(a)
        }

        val ans = solve(g, n)

        print("Case ${cnt}: ")
        when (ans) {
            0 -> println("No trees.")
            1 -> println("There is one tree.")
            else -> println("A forest of $ans trees.")
        }

        cnt++
    }
}

private fun solve(g: MutableList<MutableList<Int>>, n: Int): Int {
    val isVisit = BooleanArray(n + 1) { false }
    val q = ArrayDeque<Int>()
    var cnt = 0
    var ans = 0

    while (cnt < n) {
        for (i in 1..n) {
            if (!isVisit[i]) {
                q.addLast(i)
                isVisit[i] = true
                cnt++
                ans++
                break
            }
        }
        while (q.isNotEmpty()) {
            val cur = q.removeFirst()

            for (node in g[cur]) {
                if (!isVisit[node]) {
                    isVisit[node] = true
                    q.addLast(node)
                    g[node].remove(cur)
                    cnt++
                } else {
                    q.clear()
                    ans--
                    break
                }
            }
        }
    }

    return ans
}