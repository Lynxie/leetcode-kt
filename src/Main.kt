import solutions.ListNode
import solutions.MergeTwoSortedLists


fun main() {
    val listNode1 = ListNode(1)
    listNode1.next = ListNode(2)
    listNode1.next!!.next = ListNode(4)

    val listNode2 = ListNode(1)
    listNode2.next = ListNode(3)
    listNode2.next!!.next = ListNode(4)


    val res = MergeTwoSortedLists().mergeTwoLists(listNode1, listNode2)
    println("asd")
    println(
        res
    )
}