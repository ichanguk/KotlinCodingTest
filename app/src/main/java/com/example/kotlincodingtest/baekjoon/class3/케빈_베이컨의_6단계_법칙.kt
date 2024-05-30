package com.example.kotlincodingtest.baekjoon.class3

import java.io.BufferedReader
import java.util.LinkedList

private var linkList = mutableListOf<LinkedList<Int>>()
private var isVisit = MutableList(101) { MutableList(101) { false } }

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    linkList = MutableList(N + 1) { LinkedList<Int>() }

    repeat(M) {
        val (a, b) = readLine().split(' ').map { it.toInt() }
        linkList[a].add(b)
        linkList[b].add(a)
    }
    var sum = Int.MAX_VALUE
    var curSum:Int
    var res = 1
    for (i in 1..N) {
        curSum = bfs(i)
        if (curSum < sum) {
            sum = curSum
            res = i
        }
    }
    println(res)

}

fun bfs(start: Int):Int {
    var kevin = 0
    val q = ArrayDeque<Pair<Int,Int>>()
    q.addLast(Pair(start, 0))
    isVisit[start][start] = true
    while (q.isNotEmpty()) {
        val cur = q.removeFirst()

        for (i in linkList[cur.first]) {
            if (!isVisit[start][i]) {
                isVisit[start][i] = true
                kevin += cur.second + 1
                q.addLast(Pair(i, cur.second + 1))
            }
        }
    }
    return kevin
}