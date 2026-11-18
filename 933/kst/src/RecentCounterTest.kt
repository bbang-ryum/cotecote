import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RecentCounterTest {
    @Test
    fun ping() {
        val counter = RecentCounter()

        val result1 = counter.ping(1)
        val result2 = counter.ping(100)
        val result3 = counter.ping(3001)
        val result4 = counter.ping(3002)

        assertEquals(1, result1)
        assertEquals(2, result2)
        assertEquals(3, result3)
        assertEquals(3, result4)
    }
}
