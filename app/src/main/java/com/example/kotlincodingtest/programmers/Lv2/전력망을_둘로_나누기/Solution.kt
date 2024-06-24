package com.example.kotlincodingtest.programmers.Lv2.전력망을_둘로_나누기

import java.util.LinkedList
import kotlin.math.abs

var cnt = 0

class Solution {
    fun solution(n: Int, wires: Array<IntArray>): Int {
        var answer: Int = 1000
        val links = MutableList(n + 1){LinkedList<Int>()}

        wires.forEach{
            links[it[0]].add(it[1])
            links[it[1]].add(it[0])
        }

        var isVisit = MutableList(n + 1) { false }

        var cnt1 = 0
        var cnt2 = 0
        wires.forEach{
            cnt = 0
            isVisit[it[1]] = true
            dfs(it[0], links, isVisit)
            cnt1 = cnt
            cnt = 0
            isVisit[it[1]] = false
            isVisit[it[0]] = true
            dfs(it[1], links, isVisit)
            cnt2 = cnt
            if (abs(cnt1 - cnt2) < answer) {
                answer = abs(cnt1 - cnt2)
            }
            isVisit = MutableList(n + 1) { false }
            cnt1 = 0
            cnt2 = 0
        }
        return answer
    }
}

fun dfs(cur:Int, links:MutableList<LinkedList<Int>>, isVisit:MutableList<Boolean>){
    isVisit[cur] = true
    cnt++
    links[cur].forEach {
        if (!isVisit[it]) {
            dfs(it, links, isVisit)
        }
    }
}