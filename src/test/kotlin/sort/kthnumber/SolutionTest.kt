package sort.kthnumber

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solution() {
        val array = intArrayOf(1, 5, 2, 6, 3, 7, 4)
        val commands = arrayOf(
            intArrayOf(2, 5, 3),
            intArrayOf(4, 4, 1),
            intArrayOf(1, 7, 3)
        )
        val result = intArrayOf(5, 6, 3)
        assertEquals(result, Solution().solution(array, commands))
    }
}