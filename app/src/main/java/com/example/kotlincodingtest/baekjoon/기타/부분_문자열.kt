package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val s = readLine()
    val p = readLine()

    if (kmp(s, p)) {
        println(1)
    } else {
        println(0)
    }
}

fun kmp(text: String, pattern: String): Boolean {
    val lps = getLPS(pattern)
    var i = 0
    var j = 0

    while (i < text.length) {
        if (text[i] == pattern[j]) {
            i++
            j++
            if (j == pattern.length) return true
        } else {
            if (j != 0) {
                j = lps[j - 1]
            } else {
                i++
            }
        }
    }
    return false
}

fun getLPS(pattern: String): IntArray {
    val lps = IntArray(pattern.length)
    var len = 0
    var i = 1

    while (i < pattern.length) {
        if (pattern[i] == pattern[len]) {
            len++
            lps[i] = len
            i++
        } else {
            if (len != 0) {
                len = lps[len - 1]
            } else {
                lps[i] = 0
                i++
            }
        }
    }
    return lps
}