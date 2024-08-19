package com.example.kotlincodingtest.programmers.Lv2.교점에_별_만들기

class Solution {
    fun solution(line: Array<IntArray>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        val n = line.size
        val points = mutableListOf<Pair<Long, Long>>()

        var denominator:Long
        var xNumerator:Long
        var yNumerator:Long
        var x:Long
        var y:Long
        var minX = Long.MAX_VALUE
        var minY = Long.MAX_VALUE
        var maxX = Long.MIN_VALUE
        var maxY = Long.MIN_VALUE

        for (i in 0 until n - 1) {
            val (a, b, e) = line[i].map{it.toLong()}
            for (j in (i + 1) until n) {
                val (c, d, f) = line[j].map{it.toLong()}
                denominator = a * d - b * c
                if (denominator == 0L) {
                    continue
                }

                xNumerator = b * f - e * d
                yNumerator = e * c - a * f

                if (xNumerator % denominator != 0L ||
                    yNumerator % denominator != 0L) {
                    continue
                }

                x = xNumerator / denominator
                y = yNumerator / denominator

                points.add(Pair(x, y))
                minX = minOf(minX, x)
                minY = minOf(minY, y)
                maxX = maxOf(maxX, x)
                maxY = maxOf(maxY, y)
            }
        }

        val xLen = (maxX - minX + 1).toInt()
        val yLen = (maxY - minY + 1).toInt()

        val charAnswer = Array(yLen){CharArray(xLen) { '.' }}

        points.forEach{ (x, y) ->
            charAnswer[(maxY - y).toInt()][(x - minX).toInt()] = '*'
        }

        answer = charAnswer.map{String(it)}.toTypedArray()

        return answer
    }
}