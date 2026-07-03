import solutions.RemoveDuplicatesFromArray
import solutions.RemoveElement
import solutions.SearchInsertPosition
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis


fun main() {
//    val intarr = intArrayOf(1, 3, 5, 7)
    var intarr: IntArray = intArrayOf()
    println(measureTimeMillis {
        intarr = (-100_000_000..100_000_000 step 2).toList().toIntArray()
    })

    SearchInsertPosition().searchInsert(intarr, 56111)
    SearchInsertPosition().searchInsert2(intarr, 56111)

    println(measureTimeMillis { SearchInsertPosition().searchInsert(intarr, 96111111) })
    println(measureTimeMillis { SearchInsertPosition().searchInsert(intarr, 96111111) })
    println(measureTimeMillis { SearchInsertPosition().searchInsert2(intarr, 96111111) })
    println(measureTimeMillis { SearchInsertPosition().searchInsert2(intarr, 96111111) })
}