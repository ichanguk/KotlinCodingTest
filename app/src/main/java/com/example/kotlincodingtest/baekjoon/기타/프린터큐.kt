package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val T = readLine().toInt()

    val bw = BufferedWriter(System.out.bufferedWriter())
    var st: StringTokenizer?
    var N: Int
    var M: Int
    val q = ArrayDeque<Pair<Int, Int>>()
    var maxPriority: Int
    var curPriority: Int
    var cnt:Int
    var cur: Pair<Int, Int>

    for (i in 1..T) {
        st = StringTokenizer(readLine())
        N = st.nextToken().toInt()
        M = st.nextToken().toInt()

        st = StringTokenizer(readLine())
        val priorityList = MutableList(10) { 0 }
        maxPriority = 0

        for (i in 0 until N) {
            curPriority = st.nextToken().toInt()
            q.addLast(Pair(i, curPriority))
            priorityList[curPriority]++
            if (curPriority > maxPriority) {
                maxPriority = curPriority
            }
        }

        cnt = 1
        while (true) {
            cur = q.removeFirst()
            if (cur.second == maxPriority) {
                if (cur.first == M) {
                    bw.write("$cnt\n")
                    q.clear()
                    break
                } else {
                    cnt++
                    priorityList[maxPriority]--
                    if (priorityList[maxPriority] == 0) {
                        for (i in (maxPriority - 1) downTo 0) {
                            if (priorityList[i] != 0) {
                                maxPriority = i
                                break
                            }
                        }
                    }
                }
            } else {
                q.addLast(cur)
            }
        }
    }
    bw.flush()
    bw.close()
}