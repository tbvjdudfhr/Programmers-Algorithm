package graph.node

import java.util.*


class Solution {
    fun solution(n: Int, edge: Array<IntArray>): Int {
        var answer=0
        val graph = ArrayList<ArrayList<Int>>()
        val visited = BooleanArray(n + 1)


        for (i in 0..n) {
            graph.add(i, ArrayList())
        }

        for (i in edge.indices) {
            graph[edge[i][0]].add(edge[i][1])
            graph[edge[i][1]].add(edge[i][0])
        }

        val queue: Queue<Int> = LinkedList()
        queue.add(1)
        visited[1] = true

        while (true) {
            val temp: Queue<Int> = LinkedList()
            while (!queue.isEmpty()) {
                val cur = queue.poll()
                for (adj in graph[cur]) {
                    if (!visited[adj]) {
                        temp.add(adj)
                        visited[adj] = true
                    }
                }
            }
            if (temp.isEmpty()) break
            queue.addAll(temp)
            answer = temp.size
        }
        return answer
    }
}