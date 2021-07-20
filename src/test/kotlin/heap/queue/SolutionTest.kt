package heap.queue

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solution () {
        //val operation = arrayOf("I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1")
        val operation = arrayOf("I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333")
        val operation2 = arrayOf("I 7","I 5","I -5","D -1")

        val result = intArrayOf(333,-45)
        val result2 = intArrayOf(7,5)
        assertEquals(result, Solution().solution(operation))
        assertEquals(result2, Solution().solution(operation2))
    }
}