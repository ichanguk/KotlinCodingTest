package com.example.kotlincodingtest.baekjoon.단계별.백트래킹

import java.io.BufferedReader
import java.io.BufferedWriter

private val sudokuMap = MutableList(9) { MutableList(9) { 0 } }
private val rowMap = MutableList(9) { MutableList(10) { false } }
private val colMap = MutableList(9) { MutableList(10) { false } }
private val squareMap = MutableList(9) { MutableList(10) { false } }


fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    for (i in 0 until 9) {
        sudokuMap[i] = readLine().split(' ').map { it.toInt() }.toMutableList()
    }
    for (i in 0 until 9) {
        for (j in 0 until 9) {
            rowMap[i][sudokuMap[i][j]] = true
            colMap[j][sudokuMap[i][j]] = true
            squareMap[(i / 3) * 3 + j / 3][sudokuMap[i][j]] = true
        }
    }
    sudoku(0, 0)
}

private val bw = BufferedWriter(System.out.bufferedWriter())
fun sudoku(x:Int, y:Int) {

    if (x == 9) {
        sudokuMap.forEach {
            it.forEach {
                bw.write("$it ")
            }
            bw.newLine()
        }
        bw.flush()
        bw.close()
        System.exit(0)
    }
    if (sudokuMap[x][y] == 0) {
        for (num in 1..9) {
            if (!rowMap[x][num] && !colMap[y][num] && !squareMap[(x / 3) * 3 + y / 3][num]) {
                reverseMap(x, y, num)
                sudokuMap[x][y] = num
                if (y == 8) {
                    sudoku(x + 1, 0)
                } else {
                    sudoku(x, y + 1)
                }
                sudokuMap[x][y] = 0
                reverseMap(x, y, num)
            }
        }
    } else {
        if (y == 8) {
            sudoku(x + 1, 0)
        } else {
            sudoku(x, y + 1)
        }
    }
}

fun reverseMap(x: Int, y: Int, num: Int) {
    rowMap[x][num] = !rowMap[x][num]
    colMap[y][num] = !colMap[y][num]
    squareMap[(x / 3) * 3 + y / 3][num] = !squareMap[(x / 3) * 3 + y / 3][num]
}
