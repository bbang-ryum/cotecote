import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun asteroidCollision_1() {
        val result = solution.asteroidCollision(intArrayOf(5, 10, -5))

        assertArrayEquals(intArrayOf(5, 10), result)
    }

    @Test
    fun asteroidCollision_2() {
        val result = solution.asteroidCollision(intArrayOf(3, 5, -6, 2, -1, 4))

        assertArrayEquals(intArrayOf(-6, 2, 4), result)
    }

    @Test
    fun asteroidCollision_3() {
        val result = solution.asteroidCollision(intArrayOf(-2, -2, -1, -2))

        assertArrayEquals(intArrayOf(-2, -2, -1, -2), result)
    }
}
