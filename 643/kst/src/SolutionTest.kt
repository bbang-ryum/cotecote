import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun findMaxAverage_1() {
        val result = solution.findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4)

        assertEquals(12.75000, result)
    }

    @Test
    fun findMaxAverage_2() {
        val result = solution.findMaxAverage(intArrayOf(5), 1)

        assertEquals(5.00000, result)
    }

    @Test
    fun findMaxAverage_3() {
        val result = solution.findMaxAverage(intArrayOf(0, 1, 1, 3, 3), 4)

        assertEquals(2.00000, result)
    }

    @Test
    fun findMaxAverage_4() {
        val result = solution.findMaxAverage(intArrayOf(-1), 1)

        assertEquals(-1.00000, result)
    }
}
