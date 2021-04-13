package stackqueue.truck

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solution() {
        assertEquals(8, Solution().solution(2, 10, intArrayOf(7, 4, 5, 6)))
        assertEquals(101, Solution().solution(100, 100, intArrayOf(10)))
        assertEquals(110, Solution().solution(100, 100, intArrayOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10)))
    }
}