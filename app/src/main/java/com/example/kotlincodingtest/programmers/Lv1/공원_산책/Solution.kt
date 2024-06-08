package com.example.kotlincodingtest.programmers.Lv1.공원_산책

class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var H = park.size
        var W = park[0].length

        val parkMap = MutableList(H){ "" }

        var curX = 0
        var curY = 0
        for (i in 0 until H) {
            parkMap[i] = park[i]
            parkMap[i].forEachIndexed { j, p ->
                if (p == 'S') {
                    curX = i
                    curY = j
                }
            }
        }


        var directionMap = mutableMapOf<Char, Int> ('N' to 0, 'W' to 1,
            'S' to 2, 'E' to 3)
        val dx = mutableListOf(-1, 0, 1, 0)
        val dy = mutableListOf(0, -1, 0, 1)
        var nx:Int
        var ny:Int
        var directionIdx:Int
        var flag:Boolean

        for (route in routes) {
            flag = false
            directionIdx = directionMap[route[0]]!!
            nx = curX + dx[directionIdx] * (route[2] - '0')
            ny = curY + dy[directionIdx] * (route[2] - '0')

            if (nx in 0 until H && ny in 0 until W) {
                flag = true
                if (directionIdx >= 2) {
                    loop@for (i in curX..nx) {
                        for (j in curY..ny) {
                            if (parkMap[i][j] == 'X') {
                                flag = false
                                break@loop
                            }
                        }
                    }
                } else {
                    loop@for (i in nx..curX) {
                        for (j in ny..curY) {
                            if (parkMap[i][j] == 'X') {
                                flag = false
                                break@loop
                            }

                        }
                    }
                }
                if (flag) {
                    curX = nx
                    curY = ny
                }
            }
        }
        var answer: IntArray = intArrayOf(curX, curY)
        return answer
    }
}