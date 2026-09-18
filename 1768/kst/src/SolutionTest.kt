import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `test with a and b`() {
        val solution = Solution()
        val result = solution.solve("a", "b")
        assertEquals("ab", result)
    }

    @Test
    fun `test with abc and pqr`() {
        val solution = Solution()
        val result = solution.solve("abc", "pqr")
        assertEquals("apbqcr", result)
    }

    @Test
    fun `test with abcd and pq`() {
        val solution = Solution()
        val result = solution.solve("abcd", "pq")
        assertEquals("apbqcd", result)
    }
}
