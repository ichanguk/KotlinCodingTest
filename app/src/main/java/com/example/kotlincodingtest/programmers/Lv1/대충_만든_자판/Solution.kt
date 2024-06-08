package com.example.kotlincodingtest.programmers.Lv1.대충_만든_자판

class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val keyCntMap = mutableMapOf<Char, Int>()

        for (i in 0..('Z' - 'A')) {
            keyCntMap['A' + i] = 1000
        }

        for (key in keymap) {
            key.forEachIndexed { cnt, c ->
                if (cnt < keyCntMap[c]!!) {
                    keyCntMap[c] = cnt + 1
                }
            }
        }

        val answer = IntArray(targets.size, { -1 })

        var cnt:Int
        loop@for (i in targets.indices) {
            cnt = 0
            for (c in targets[i]) {
                if (keyCntMap[c]!! != 1000) {
                    cnt += keyCntMap[c]!!
                } else {
                    continue@loop
                }
            }
            answer[i] = cnt

        }

        return answer
    }
}