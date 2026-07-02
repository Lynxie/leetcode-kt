package solutions

// https://leetcode.com/problems/merge-two-sorted-lists/description/

class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy = ListNode(0)
        var prevNode = dummy

        var list1Node = list1
        var list2Node = list2

        while (list1Node != null && list2Node != null) {
            if (list1Node.`val` > list2Node.`val`) {
                prevNode.next = list2Node
                prevNode = list2Node
                list2Node = list2Node.next
            } else {
                prevNode.next = list1Node
                prevNode = list1Node
                list1Node = list1Node.next
            }
        }

        prevNode.next = list1Node ?: list2Node

        return dummy.next
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}