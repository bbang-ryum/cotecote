import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun `123 with 3`() {
        val result = solution.kidsWithCandies(intArrayOf(1, 2, 3), 3)

        assertEquals(listOf(true, true, true), result)
    }

    @Test
    fun `23513 with 3`() {
        val result = solution.kidsWithCandies(intArrayOf(2, 3, 5, 1, 3), 3)

        assertEquals(listOf(true, true, true, false, true), result)
    }

    @Test
    fun getMax() {
        val max = solution.getMax(intArrayOf(1, 2, 3))

        assertEquals(3, max)
    }

}
