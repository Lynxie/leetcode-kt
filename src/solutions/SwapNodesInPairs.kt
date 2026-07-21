package solutions

// https://leetcode.com/problems/swap-nodes-in-pairs/description/

class SwapNodesInPairs {

    fun swapPairs(head: ListNode?): ListNode? {
        // (1) -> (2) -> (3) -> (4) -> (5) -> (6)
        // (2) -> (1) -> (4) -> (3) -> (6) -> (5)

        var res = head
        var current = head
        var pp2: ListNode? = null
        while (current != null) {
            val cp1 = current
            val cp2 = current.next ?: break

            if (pp2 == null) {
                res = cp2
            } else {
                pp2.next = cp2
            }

            cp1.next = cp2.next
            cp2.next = cp1
            pp2 = cp1

            current = cp1.next
        }

        return res
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

}