package com.example.kotlincodingtest.baekjoon.단계별.그래프와_순회

import java.io.BufferedReader
import java.util.LinkedList

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()
    val q = ArrayDeque<Int>()

    repeat(T) {
        val (V, E) = readLine().split(' ').map { it.toInt() }
        val linkList = MutableList(V + 1) { LinkedList<Int>() }
        val isVisit = MutableList(V + 1) { 0 }
        repeat(E) {
            val (a, b) = readLine().split(' ').map { it.toInt() }
            linkList[a].add(b)
            linkList[b].add(a)
        }
        var flag = true
        loop@for (i in 1..V) {
            if (isVisit[i] == 0) {
                q.addLast(i)
                isVisit[i] = 1
                while (q.isNotEmpty()) {
                    val cur = q.removeFirst()
                    linkList[cur].forEach {
                        if (isVisit[it] == 0) {
                            if (isVisit[cur] == 1) {
                                isVisit[it] = 2
                            } else {
                                isVisit[it] = 1
                            }
                            q.addLast(it)
                        } else {
                            if (isVisit[cur] == 1 && isVisit[it] == 1) {
                                flag = false
                            } else if (isVisit[cur] == 2 && isVisit[it] == 2) {
                                flag = false
                            }
                        }
                    }
                    if (!flag) {
                        q.clear()
                        break@loop
                    }
                }
            }
        }
        if (flag) {
            println("YES")
        } else {
            println("NO")
        }
    }
}