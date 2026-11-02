import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun uniqueOccurrences() {
        val result = solution.uniqueOccurrences(intArrayOf(1, 2, 2, 1, 1, 3))

        assertTrue(result)
    }

    @Test
    fun count() {
        val result = solution.count(intArrayOf(1, 2, 2, 1, 1, 3))

        assertEquals(listOf(3, 2, 1), result)
    }
}
