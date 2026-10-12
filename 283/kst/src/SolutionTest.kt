import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun moveZeros_1() {
        val numbers = intArrayOf(0, 1, 0, 3, 12)
        solution.moveZeroes(numbers)

        assertArrayEquals(intArrayOf(1, 3, 12, 0, 0), numbers)
    }

    @Test
    fun moveZeros_2() {
        val numbers = intArrayOf(1)
        solution.moveZeroes(numbers)

        assertArrayEquals(intArrayOf(1), numbers)
    }

    @Test
    fun moveZeros_3() {
        val numbers = intArrayOf(2, 1)
        solution.moveZeroes(numbers)

        assertArrayEquals(intArrayOf(2, 1), numbers)
    }

    @Test
    fun moveZeros_4() {
        val numbers = intArrayOf(1, 0, 1)
        solution.moveZeroes(numbers)

        assertArrayEquals(intArrayOf(1, 1, 0), numbers)
    }
}
