import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun pivotIndex() {
        val result = solution.pivotIndex(intArrayOf(1,7,3,6,5,6))

        assertEquals(3, result)
    }

    @Test
    fun pivotIndex_2() {
        val result = solution.pivotIndex(intArrayOf(1, 2, 3))

        assertEquals(-1, result)
    }

    @Test
    fun pivotIndex_3() {
        val result = solution.pivotIndex(intArrayOf(2, 1, -1))

        assertEquals(0, result)
    }
}
