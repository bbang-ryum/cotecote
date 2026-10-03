import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun increasingTriplet_1() {
        val result = solution.increasingTriplet(intArrayOf(1, 2, 3, 4, 5))

        assertTrue(result)
    }

    @Test
    fun increasingTriplet_2() {
        val result = solution.increasingTriplet(intArrayOf(5, 4, 3, 2, 1))

        assertFalse(result)
    }

    @Test
    fun increasingTriplet_3() {
        val result = solution.increasingTriplet(intArrayOf(2, 1,5, 0, 4, 6))

        assertTrue(result)
    }

    @Test
    fun increasingTriplet_4() {
        val result = solution.increasingTriplet(intArrayOf(20, 100 ,10, 12, 5, 13))

        assertTrue(result)
    }

    @Test
    fun increasingTriplet_5() {
        val result = solution.increasingTriplet(intArrayOf(1, 2, 1, 3))

        assertTrue(result)
    }

    @Test
    fun increasingTriplet_6() {
        val result = solution.increasingTriplet(intArrayOf(1, 5, 0, 4, 1, 3))

        assertTrue(result)
    }
}
