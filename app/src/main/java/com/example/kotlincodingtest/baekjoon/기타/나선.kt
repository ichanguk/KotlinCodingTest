import java.io.BufferedReader

fun main() = with(BufferedReader(System.`in`.bufferedReader())) {
    val (M, N) = readLine().split(' ').map { it.toInt() }
    val isVisit = Array(N) { BooleanArray(M) { false } }

    val dq = ArrayDeque<Pair<Int, Int>>()
    dq.addLast(Pair(N - 1, 0))
    isVisit[N - 1][0] = true

    val dx = arrayOf(0, -1, 0, 1)
    val dy = arrayOf(1, 0, -1, 0)

    var dir = 0
    var nx = 0
    var ny = 0
    var cnt = 1

    while (dq.isNotEmpty() ) {
        val cur = dq.removeFirst()

        if (cnt == N * M) {
            println("${cur.second} ${N - (cur.first + 1)}")
            break
        }
        nx = cur.first + dx[dir]
        ny = cur.second + dy[dir]

        if (!(nx in 0 until N && ny in 0 until M && !isVisit[nx][ny])) {
            dir = (dir + 1) % 4
            nx = cur.first + dx[dir]
            ny = cur.second + dy[dir]
        }

        dq.addLast(Pair(nx, ny))
        isVisit[nx][ny] = true
        cnt++
    }

}