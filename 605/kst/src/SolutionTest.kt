import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun canPlaceFlowers_1() {
        val result = solution.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 1)

        assertTrue(result)
    }

    @Test
    fun canPlaceFlowers_2() {
        val result = solution.canPlaceFlowers(intArrayOf(0, 0, 1, 0, 0), 1)

        assertTrue(result)
    }

    @Test
    fun checkLeft() {
        val result = solution.checkLeft(0, intArrayOf(0))

        assertTrue(result)
    }
}
