package dfsbfs.targetnumber

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solution() {
        val numbers = intArrayOf(1,1,1,1,1)
        val target = 3
        val result = 5

        assertEquals(result, Solution().solution(numbers, target))
    }
}