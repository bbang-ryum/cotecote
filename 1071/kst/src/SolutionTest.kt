import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun `A and A`() {
        val result = solution.solve("A", "A")

        assertEquals("A", result)
    }

    @Test
    fun `A and AB`() {
        val result = solution.solve("A", "AB")

        assertEquals("", result)
    }

    @Test
    fun `AB and AB`() {
        val result = solution.solve("AB", "AB")

        assertEquals("AB", result)
    }

    @Test
    fun `ABCABC and ABC`() {
        val result = solution.solve("ABCABC", "ABC")

        assertEquals("ABC", result)
    }
}
