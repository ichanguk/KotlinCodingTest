package com.example.kotlincodingtest.programmers.Lv3.불량_사용자

lateinit var userIdList:List<String>
lateinit var bannedIdList:List<String>
lateinit var isVisit:MutableList<Boolean>
val result = mutableSetOf<Set<String>>()
class Solution {
    fun solution(user_id: Array<String>, banned_id: Array<String>): Int {
        isVisit = MutableList(user_id.size){false}
        var s = mutableSetOf<String>()
        userIdList = user_id.toList()
        bannedIdList = banned_id.toList()
        dfs(mutableSetOf<String>(), 0)

        println(result)
        return result.size
    }
}

fun dfs(cur:MutableSet<String>, depth: Int) {
    if (depth == bannedIdList.size) {
        result.add(cur.toSet())
        return
    }
    for (i in userIdList.indices) {
        if (!isVisit[i]) {
            if (match(userIdList[i], bannedIdList[depth])) {
                isVisit[i] = true
                cur.add(userIdList[i])
                dfs(cur, depth + 1)
                isVisit[i] = false
                cur.remove(userIdList[i])
            }
        }
    }
}

fun match(userId:String, bannedId:String):Boolean {
    return userId.matches(bannedId.replace('*', '.').toRegex())
}