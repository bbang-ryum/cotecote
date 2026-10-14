import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun maxArea() {
        val result = solution.maxArea(intArrayOf(1,8,6,2,5,4,8,3,7))

        assertEquals(49, result)
    }
}
