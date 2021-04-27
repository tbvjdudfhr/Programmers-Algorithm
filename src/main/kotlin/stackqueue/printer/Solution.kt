package stackqueue.printer
import java.util.*

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        var list: LinkedList<Pair<Int, Int>> = LinkedList()
        priorities.mapIndexed { index, i ->
            list.offer(Pair(i, index))
        }

        while (true) {

            val now = list.poll()

            if (list.any { now.first < it.first }) {
                list.add(now)
            } else {
                answer++
                if (now.second == location)
                    break
            }

        }

        return answer
    }
}