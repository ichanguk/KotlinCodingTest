package com.example.kotlincodingtest.baekjoon.class4

import java.io.BufferedReader

data class TreeNode(
    var value: String,
    var leftNode: TreeNode? = null,
    var rightNode: TreeNode? = null,
)

class Tree {
    var root: TreeNode? = null

    fun insert(node: TreeNode, value: String, left: String, right: String) {
        if (node.value == value) {
            if (left != ".") {
                node.leftNode = TreeNode(left)
            }
            if (right != ".") {
                node.rightNode = TreeNode(right)
            }
        } else {
            if (node.leftNode != null) {
                insert(node.leftNode!!, value, left, right)
            }
            if (node.rightNode != null){
                insert(node.rightNode!!, value, left, right)
            }
        }
    }

    fun preOrder(node: TreeNode) {
        print(node.value)
        if (node.leftNode != null) {
            preOrder(node.leftNode!!)
        }
        if (node.rightNode != null) {
            preOrder(node.rightNode!!)
        }
    }

    fun inOrder(node: TreeNode) {
        if (node.leftNode != null) {
            inOrder(node.leftNode!!)
        }
        print(node.value)
        if (node.rightNode != null) {
            inOrder(node.rightNode!!)
        }
    }

    fun postOrder(node: TreeNode) {
        if (node.leftNode != null) {
            postOrder(node.leftNode!!)
        }
        if (node.rightNode != null) {
            postOrder(node.rightNode!!)
        }
        print(node.value)
    }
}


fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val n = readLine().toInt()
    val tree = Tree()
    tree.root = TreeNode("A")
    repeat(n) {
        val (v, l, r) = readLine().split(' ')
        tree.insert(tree.root!!, v, l, r)
    }

    tree.preOrder(tree.root!!)
    println()
    tree.inOrder(tree.root!!)
    println()
    tree.postOrder(tree.root!!)
    println()


}