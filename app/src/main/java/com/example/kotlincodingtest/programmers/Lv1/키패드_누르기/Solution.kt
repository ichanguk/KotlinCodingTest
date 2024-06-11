package com.example.kotlincodingtest.programmers.Lv1.키패드_누르기

import kotlin.math.*

class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        val sb = StringBuilder()

        var lPos = Pair(3, 0)
        var rPos = Pair(3, 2)
        var nPos = Pair(0, 0)
        var n: Int
        var lDist: Int
        var rDist: Int
        for (i in numbers.indices) {
            n = if (numbers[i] == 0) 10 else numbers[i] - 1
            nPos = Pair(n / 3, n % 3)

            when (n % 3) {
                0 -> {
                    sb.append('L')
                    lPos = nPos
                }

                1 -> {
                    lDist = abs(nPos.first - lPos.first) +
                            abs(nPos.second - lPos.second)
                    rDist = abs(nPos.first - rPos.first) +
                            abs(nPos.second - rPos.second)

                    if (lDist < rDist) {
                        sb.append('L')
                        lPos = nPos
                    } else if (lDist == rDist) {
                        if (hand == "left") {
                            sb.append('L')
                            lPos = nPos
                        } else {
                            sb.append('R')
                            rPos = nPos
                        }
                    } else {
                        sb.append('R')
                        rPos = nPos
                    }

                }

                2 -> {
                    sb.append('R')
                    rPos = nPos
                }
            }

        }


        return sb.toString()
    }
}