package com.example.kotlincodingtest.programmers.Lv2.메뉴_리뉴얼

val combiMap = mutableMapOf<String, Int>()
val sb = StringBuilder()

class Solution {
    fun solution(orders: Array<String>, course: IntArray): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        for (order in orders) {
            val sortedOrder = order.toCharArray().sortedArray()
            for (c in course) {
                combi(sortedOrder, 0, c, 0)
            }
        }

        val combiList = combiMap.toList()
            .filter{it.second >= 2}
            .sortedWith(
                compareBy<Pair<String, Int>>{
                    it.first.length
                }.thenByDescending{
                    it.second
                }
            )

        var i = 0
        var curMax = 0
        var curLen = 0
        while (i < combiList.size) {
            curMax = combiList[i].second
            answer += combiList[i].first
            curLen = combiList[i].first.length
            for (j in (i + 1) until combiList.size) {
                if (combiList[j].second == curMax &&
                    combiList[j].first.length == curLen) {
                    answer += combiList[j].first
                    i++
                } else {
                    break
                }
            }
            for (j in i until combiList.size) {
                if (combiList[j].first.length == curLen) {
                    i++
                } else {
                    break
                }
            }
        }

        return answer.sortedArray()
    }
}

fun combi(order:CharArray, idx:Int, c:Int, depth:Int) {
    if (depth == c) {
        combiMap[sb.toString()] = combiMap.getOrDefault(sb.toString(), 0) + 1
        return
    }

    for (i in idx until order.size) {
        sb.append(order[i])
        combi(order, i + 1, c, depth + 1)
        sb.deleteCharAt(sb.length - 1)
    }
}