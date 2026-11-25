import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun deleteMiddle() {
        val linkedList = ListNode(
            1,
            ListNode(
                2,
                ListNode(
                    3,
                    ListNode(
                        4
                    )
                )
            )
        )

        val result = solution.deleteMiddle(
            linkedList
        )

        assertEquals(
            ListNode(
                1,
                ListNode(
                    2,
                    ListNode(
                        4
                    )
                )
            ), result
        )
    }

    @Test
    fun deleteMiddle_2() {
        val linkedList = ListNode(
            1,
            ListNode(
                3,
                ListNode(
                    4,
                    ListNode(
                        7,
                        ListNode(
                            1,
                            ListNode(
                                2,
                                ListNode(
                                    6
                                )
                            )
                        )
                    )
                )
            )
        )

        val result = solution.deleteMiddle(
            linkedList
        )

        assertEquals(
            ListNode(
                1,
                ListNode(
                    3,
                    ListNode(
                        4,
                        ListNode(
                            1,
                            ListNode(
                                2,
                                ListNode(
                                    6
                                )
                            )
                        )
                    )
                )
            ), result
        )
    }
}
