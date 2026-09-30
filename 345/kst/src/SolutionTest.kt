import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun reverseVowels() {
        val result = solution.reverseVowels("IceCreAm")

        assertEquals("AceCreIm", result)
    }

    @Test
    fun reverseVowels_2() {
        val result = solution.reverseVowels("leetcode")

        assertEquals("leotcede", result)
    }

    @Test
    fun getVowels() {
        val vowels = solution.getVowels("IceCreAm")

        assertEquals(listOf(
            Vowel(0, 'I'),
            Vowel(2, 'e'),
            Vowel(5, 'e'),
            Vowel(6, 'A'),
        ), vowels)
    }
}
