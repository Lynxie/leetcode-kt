import solutions.RemoveDuplicatesFromArray


fun main() {
    val intarr = intArrayOf(1, 1, 1, 1, 2, 2)
    val res = RemoveDuplicatesFromArray().removeDuplicates(intarr)
    println(res)
    println(intarr.contentToString())
}