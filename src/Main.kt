import solutions.LongestPalindromicSubstring
import solutions.MergeIntervals
import solutions.PhoneLetterCombinations
import kotlin.system.measureTimeMillis

fun main() {
    val a = MergeIntervals().merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))
    println(
        a.toString()
    )
}