import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun compress_1() {
        val word = charArrayOf('a', 'a', 'b', 'b', 'c', 'c')
        val result = solution.compress(word)

        assertEquals(6, result)
        assertArrayEquals(charArrayOf('a', '2', 'b', '2', 'c', '2'), word.dropLast(1).toCharArray())
    }

    @Test
    fun compress_2() {
        val word = charArrayOf('a')
        val result = solution.compress(word)

        assertEquals(1, result)
        assertArrayEquals(charArrayOf('a'), word)
    }

    @Test
    fun compress_3() {
        val word = charArrayOf('a', 'b', 'b')
        val result = solution.compress(word)

        assertEquals(2, result)
        assertArrayEquals(charArrayOf('a', 'b', '2'), word)
    }

    @Test
    fun compress_4() {
        val word = charArrayOf('a', 'b', 'c')
        val result = solution.compress(word)

        assertEquals(3, result)
        assertArrayEquals(charArrayOf('a', 'b', 'c'), word)
    }

    @Test
    fun compress_5() {
        val word = charArrayOf('a', 'a', 'b')
        val result = solution.compress(word)

        assertEquals(3, result)
        assertArrayEquals(charArrayOf('a', '2', 'b'), word)
    }

    @Test
    fun compress_6() {
        val word = charArrayOf('a', 'b', 'b', 'b', 'c')
        val result = solution.compress(word)

        assertEquals(4, result)
        assertArrayEquals(charArrayOf('a', 'b', '3', 'c'), word)
    }

    @Test
    fun compress_7() {
        val word = charArrayOf('a', 'b')
        val result = solution.compress(word)

        assertEquals(2, result)
        assertArrayEquals(charArrayOf('a', 'b'), word)
    }
}

