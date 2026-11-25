class Solution {
    //링크드리스트 헤드가 주어졌을 때 중간노드를 리스트에서 제거하고 리스트의 헤드를 반환해라
    //중간노드는 0 based 인덱스 기준으로 n / 2 이다
    //0 -> 0
    //0, 1 -> 1
    //0, 1, 2 -> 1
    //0, 1, 2, 3 -> 2
    //beforeSlow slow fast
    //while (fast != null) {
    //beforeSlow = slow
    //slow = slow.next
    //fast = fast.next
    //}
    //

    fun deleteMiddle(head: ListNode): ListNode? {
        if (head.next == null) {
            return null
        }

        val beforeHead = ListNode(0, head)

        var beforeSlow: ListNode? = null
        var slow: ListNode? = head
        var fast: ListNode? = head

        while (fast?.next != null) {
            beforeSlow = slow
            fast = fast.next?.next
            slow = slow?.next
        }

        beforeSlow?.next = slow?.next

        return beforeHead.next
    }
}

data class ListNode(
    val `val`: Int,
    var next: ListNode? = null
) {
    override fun equals(other: Any?): Boolean {
        if (other !is ListNode) {
            return false
        }

        return this.`val` == other.`val` && next == other.next
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }
}
