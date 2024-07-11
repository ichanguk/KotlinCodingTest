package com.example.kotlincodingtest.programmers.Lv3.이중_우선순위_큐

import java.util.PriorityQueue

class Solution {
    fun solution(operations: Array<String>): IntArray {
        var cntMap = mutableMapOf<Int, Int>()
        val pqMin = PriorityQueue<Int>()
        val pqMax = PriorityQueue<Int>(compareByDescending{it})

        operations.forEach{
            val cmd = it.split(' ')
            when (cmd[0]) {
                "I" -> {
                    val num = cmd[1].toInt()
                    cntMap[num] = cntMap.getOrDefault(num, 0) + 1
                    pqMin.add(cmd[1].toInt())
                    pqMax.add(cmd[1].toInt())
                }
                "D" -> {
                    when (cmd[1]) {
                        "-1" -> {
                            if (pqMin.isNotEmpty()) {
                                cntMap[pqMin.first()] = cntMap[pqMin.first()]!! - 1
                                pqMin.remove()
                            }
                        }
                        "1" -> {
                            if (pqMax.isNotEmpty()) {
                                cntMap[pqMax.first()] = cntMap[pqMax.first()]!! - 1
                                pqMax.remove()
                            }
                        }
                    }
                    while (pqMin.isNotEmpty() && cntMap[pqMin.first()] == 0) {
                        pqMin.remove()
                    }
                    while (pqMax.isNotEmpty() && cntMap[pqMax.first()] == 0) {
                        pqMax.remove()
                    }
                }
            }
        }

        if (pqMin.isEmpty() || pqMax.isEmpty()) {
            return intArrayOf(0, 0)
        } else {
            return intArrayOf(pqMax.first(), pqMin.first())
        }
    }
}