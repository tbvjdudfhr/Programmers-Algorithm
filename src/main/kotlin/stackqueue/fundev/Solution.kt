package stackqueue.fundev

import java.util.*
import kotlin.math.ceil

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer: IntArray
        var queue: Queue<Int> = LinkedList()

        for (i in progresses.indices) {
            val deploy = ceil((100 - progresses[i]).toDouble() / speeds[i]).toInt()
            queue.add(deploy)
        }
        
        var deployArr = mutableListOf<Int>()
        // poll 값을 가져오면서 큐에서 제거
        // peek 값만 가져옴
        while (queue.isNotEmpty()) {
            var count = 1
            var first = queue.poll()
            while (queue.isNotEmpty() && queue.peek() <= first) {
                queue.remove()
                count++
            }
            deployArr.add(count)
        }
        answer = deployArr.toIntArray()
        
        return answer
    }
}