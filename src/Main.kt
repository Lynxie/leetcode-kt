import solutions.RemoveNodeFromList

fun main() {

    val head = RemoveNodeFromList.ListNode(1)
    for (i in 2..6) {
        head.next = RemoveNodeFromList.ListNode(i)
    }

    println(RemoveNodeFromList().removeNthFromEnd(head, 2))

}