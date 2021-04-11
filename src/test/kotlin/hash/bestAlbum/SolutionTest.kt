package hash.bestAlbum

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solution() {
        val genres = arrayOf(
            "classic", "pop", "classic", "classic", "pop"
        )
        val plays = arrayOf(
            500, 600, 150, 800, 2500
        )

        val result = arrayOf(
            4, 1, 3, 0
        )
        assertEquals(result, Solution().solution(genres, plays))
    }
}