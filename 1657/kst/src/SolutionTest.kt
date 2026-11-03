import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun closeStrings_1() {
        val result = solution.closeStrings("abc", "bca")

        assertTrue(result)
    }

    @Test
    fun closeStrings_2() {
        val result = solution.closeStrings("cabbba", "abbccc")

        assertTrue(result)
    }

    @Test
    fun closeStrings_3() {
        val result = solution.closeStrings("a", "aa")

        assertFalse(result)
    }

    @Test
    fun closeStrings_4() {
        val result = solution.closeStrings("cabbba", "aabbss")

        assertFalse(result)
    }

    @Test
    fun closeStrings_5() {
        val result = solution.closeStrings("uau", "ssx")

        assertFalse(result)
    }

    @Test
    fun closeStrings_6() {
        val result = solution.closeStrings("aaabbbbccddeeeeefffff", "aaaaabbcccdddeeeeffff")

        assertFalse(result)
    }

    @Test
    fun closeStrings_7() {
        val result = solution.closeStrings("abbzccca", "babzzczc")

        assertTrue(result)
    }

    @Test
    fun countCharacters() {
        val result = solution.countCharacters("abc")

        assertEquals(mapOf('a' to 1, 'b' to 1, 'c' to 1), result)
    }
}
