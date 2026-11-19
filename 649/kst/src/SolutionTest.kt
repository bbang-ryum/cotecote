import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun predictPartyVictory() {
        val result = solution.predictPartyVictory("RD")

        assertEquals("Radiant", result)
    }

    @Test
    fun predictPartyVictory_2() {
        val result = solution.predictPartyVictory("RDD")

        assertEquals("Dire", result)
    }

    @Test
    fun predictPartyVictory_3() {
        val result = solution.predictPartyVictory("DDRRR")

        assertEquals("Dire", result)
    }
}
