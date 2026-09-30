import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun reverseWords() {
        val result = solution.reverseWords("the sky is  blue ")

        assertEquals("blue is sky the", result)
    }
}
