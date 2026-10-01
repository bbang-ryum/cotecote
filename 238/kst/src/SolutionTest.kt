import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun productExceptSelf() {
        val result = solution.productExceptSelf(intArrayOf(1, 2, 3, 4))

        assertArrayEquals(intArrayOf(24, 12, 8, 6), result)
    }

    @Test
    fun productExceptSelf_2() {
        val result = solution.productExceptSelf(intArrayOf(-1, 1, 0, -3, 3))

        assertArrayEquals(intArrayOf(0, 0, 9, 0, 0), result)
    }
}
