package stackqueue.printer

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solution() {
        var priorites = intArrayOf(2,1,3,2)
        var priorites2 = intArrayOf(1,1,9,1,1,1)
        var location = 2
        var location2 = 0

        assertEquals(1, Solution().solution(priorites, location))
        assertEquals(5, Solution().solution(priorites2, location2))
    }
}