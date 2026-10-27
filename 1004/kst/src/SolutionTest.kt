import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun longestOnes_1() {
        val result = solution.longestOnes(intArrayOf(1,1,1,0,0,0,1,1,1,1,0), 2)

        assertEquals(6, result)
    }

    @Test
    fun longestOnes_2() {
        val result = solution.longestOnes(intArrayOf(0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1), 3)

        assertEquals(10, result)
    }
}
