package sort.largestnumber

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solution() {
        val array1 = intArrayOf(6, 10, 2)
        val result1 = "6210"
        val array2 = intArrayOf(3, 30, 34, 5, 9)
        val result2 = "9534330"

        assertEquals(result1, Solution().solution(array1))
        assertEquals(result2, Solution().solution(array2))
    }
}