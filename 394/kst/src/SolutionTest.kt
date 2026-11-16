import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun decodeString() {
        val result = solution.decodeString("3[a]2[bc]")

        assertEquals("aaabcbc", result)
    }

    @Test
    fun decodeString_with_a() {
        val result = solution.decodeString("a")

        assertEquals("a", result)
    }
}
