package solutions

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

class RemoveNodeFromList {

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var l: ListNode? = head
        val arr = arrayListOf<ListNode>()
        while (l != null) {
            arr.add(l)
            l = l.next
        }

        val nodeToRemove = arr.size - n
        if (nodeToRemove == 0) {
            return arr[nodeToRemove].next
        } else if (nodeToRemove >= 1) {
            arr[nodeToRemove-1].next = arr[nodeToRemove].next
        }

        return head
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}

