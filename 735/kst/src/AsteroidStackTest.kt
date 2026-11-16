import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AsteroidStackTest {

    @Test
    fun add() {
        val stack = AsteroidStack()
        stack.add(1)

        assertArrayEquals(intArrayOf(1), stack.state())
    }

    @Test
    fun add_two_asteroids() {
        val stack = AsteroidStack()
        stack.add(1)
        stack.add(2)

        assertArrayEquals(intArrayOf(1, 2), stack.state())
    }

    @Test
    fun add_two_asteroids_would_collid() {
        val stack = AsteroidStack()
        stack.add(2)
        stack.add(1)

        assertArrayEquals(intArrayOf(2), stack.state())
    }

    @Test
    fun add_two_asteroids_would_collid_2() {
        val stack = AsteroidStack()
        stack.add(8)
        stack.add(-8)

        assertArrayEquals(intArrayOf(), stack.state())
    }

    @Test
    fun calculate_1() {
        val stack = AsteroidStack()

        val result = stack.calculate(1, 1)

        assertFalse(result)
    }
}
