import solutions.RemoveDuplicatesFromArray
import solutions.RemoveElement


fun main() {
    val intarr = intArrayOf(1, 2, 1, 2, 2)
    val res = RemoveElement().removeElement2(intarr, 1)
    println(res)
    println(intarr.contentToString())
}