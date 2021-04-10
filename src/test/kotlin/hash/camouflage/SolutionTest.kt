package hash.camouflage

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test




internal class SolutionTest {
    @Test
    fun solution() {
        val clothes = arrayOf(
            arrayOf("yellow_hat", "headgear"),
            arrayOf("blue_sunglasses", "eyewear"),
            arrayOf("green_turban", "headgear")
        )
        val sol = Solution()
        assertEquals(5, sol.solution(clothes))
    }
}