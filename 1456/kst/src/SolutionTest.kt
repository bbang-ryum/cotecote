import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun maxVowels_1() {
        val result = solution.maxVowels("abciiidef", 3)

        assertEquals(3, result)
    }

    @Test
    fun maxVowels_2() {
        val result = solution.maxVowels("aeiou", 2)

        assertEquals(2, result)
    }

    @Test
    fun maxVowels_3() {
        val result = solution.maxVowels("leetcode", 3)

        assertEquals(2, result)
    }

    @Test
    fun maxVowels_4() {
        val result = solution.maxVowels("a", 1)

        assertEquals(1, result)
    }
}
