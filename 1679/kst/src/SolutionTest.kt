import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun maxOperations_1() {
        val result = solution.maxOperations(intArrayOf(1, 2, 3, 4), 5)

        assertEquals(2, result)
    }

    @Test
    fun maxOperations_2() {
        val result = solution.maxOperations(intArrayOf(3, 1, 3, 4, 3), 6)

        assertEquals(1, result)
    }


    @Test
    fun getIndices() {
        val index = solution.getIndices(intArrayOf(1, 2, 3, 4, 4))

        assertEquals(
            mapOf(
                Pair(1, mutableListOf(0)),
                Pair(2, mutableListOf(1)),
                Pair(3, mutableListOf(2)),
                Pair(4, mutableListOf(3, 4)),
                ),
            index
        )
    }
}
