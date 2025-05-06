package com.example.kotlincodingtest.baekjoon.기타

import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()

    repeat(n) {
        print('*')
    }
    println()

    repeat(n / 2 - 1) {
        print('*')
        repeat(it) {
            print(' ')
        }
        print('*')
        repeat(n - 2 * (it + 2)) {
            print(' ')
        }
        print('*')
        repeat(it) {
            print(' ')
        }
        println('*')
    }

    if (n % 2 == 1 && n > 1) {
        print('*')
        repeat((n - 3) / 2) {
            print(' ')
        }
        print('*')
        repeat((n - 3) / 2) {
            print(' ')
        }
        println('*')
    }

    repeat(n / 2 - 1) {
        print('*')
        repeat((n - 4) / 2 - it) {
            print(' ')
        }
        print('*')
        if (n % 2 == 0) {
            repeat(2 * it) {
                print(' ')
            }
        } else {
            repeat(2 * it + 1) {
                print(' ')
            }
        }

        print('*')
        repeat((n - 4) / 2 - it) {
            print(' ')
        }
        println('*')
    }

    if (n > 1) {
        repeat(n) {
            print('*')
        }
        println()
    }

}