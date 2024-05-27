package com.example.kotlincodingtest.baekjoon.단계별.최단경로

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.LinkedList
import java.util.PriorityQueue

private val INF = Int.MAX_VALUE

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (V, E) = readLine().split(' ').map { it.toInt() }
    val s = readLine().toInt()
    val linkList = MutableList(V + 1) { LinkedList<Pair<Int, Int>>() }
    val dist = MutableList(V + 1) { INF }
    repeat(E) {
        val (u, v, w) = readLine().split(' ').map { it.toInt() }
        linkList[u].add(Pair(v, w))
    }

    val q = PriorityQueue<Pair<Int, Int>>(compareBy { it.first })
    q.add(Pair(0 , s))
    dist[s] = 0
    var nextCost:Int
    var nextCur:Int

    while (q.isNotEmpty()) {
        val cur = q.remove()

        if (dist[cur.second] < cur.first) {
            continue
        }
        for (l in linkList[cur.second]) {
            nextCur = l.first
            nextCost = l.second + cur.first
            if (nextCost < dist[nextCur]) {
                dist[nextCur] = nextCost
                q.add(Pair(nextCost, nextCur))
            }
        }
    }

    val bw = BufferedWriter(System.out.bufferedWriter())

    for (i in 1..V) {
        if (dist[i] == INF) {
            bw.write("INF\n")
        } else {
            bw.write("${dist[i]}\n")
        }
    }
    bw.flush()
    bw.close()

}