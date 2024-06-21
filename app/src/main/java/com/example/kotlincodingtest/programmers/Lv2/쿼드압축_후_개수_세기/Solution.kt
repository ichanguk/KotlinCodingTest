package com.example.kotlincodingtest.programmers.Lv2.쿼드압축_후_개수_세기

val answer = intArrayOf(0, 0)
class Solution {
    fun solution(arr: Array<IntArray>): IntArray {
        quadTree(arr, 0, 0, arr.size)
        return answer
    }
}

fun quadTree(arr: Array<IntArray>, sx:Int, sy:Int, N:Int) {
    val cur = arr[sx][sy]
    var flag = true
    loop@for (i in sx until sx + N) {
        for (j in sy until sy + N) {
            if (arr[i][j] != cur) {
                flag = false
                break@loop
            }
        }
    }
    if (flag) {
        answer[cur]++
        return
    }
    quadTree(arr, sx, sy, N / 2)
    quadTree(arr, sx + N / 2 , sy, N / 2)
    quadTree(arr, sx, sy + N / 2, N / 2)
    quadTree(arr, sx + N / 2, sy + N / 2, N / 2)

}