package heap.diskcontroller
import java.util.*

class Solution {
    fun solution(jobs: Array<IntArray>): Int {
        var answer = 0
        var time = 0
        var waitingQueue = PriorityQueue<Job>(compareBy({it.start}))

        for (i in jobs.indices) {
            var job = Job(jobs[i][0], jobs[i][1])
            waitingQueue.offer(job)
        }
        while (!waitingQueue.isEmpty()) {
            var readyQueue =
                PriorityQueue<Job>(compareBy { it.during })
            while (!waitingQueue.isEmpty() && time >= waitingQueue.peek().start) {
                readyQueue.offer(waitingQueue.poll())
            }
            if (readyQueue.isEmpty()) {
                time++
                continue
            }
            time += readyQueue.peek().during
            answer += time -readyQueue.peek().start
            readyQueue.poll()
            for (i in readyQueue.indices) {
                waitingQueue.offer(readyQueue.poll())
            }
        }
        answer /= jobs.size

        return answer
    }
}

data class Job(var start: Int = 0, var during: Int = 0)