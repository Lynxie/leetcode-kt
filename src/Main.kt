import solutions.SwapNodesInPairs

fun main() {

    val head = SwapNodesInPairs.ListNode(1)
    var n = head
    for (i in 2..5) {
        n.next = SwapNodesInPairs.ListNode(i)
        n = n.next!!
    }

    println(SwapNodesInPairs().swapPairs(head))

}