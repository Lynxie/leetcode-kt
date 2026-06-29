package solutions

// https://leetcode.com/problems/longest-common-prefix/description/

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        val minStr = strs.minBy { it.length }
        var prefixLength = 0

        outer@ for (i in minStr.indices) {
            val currentChar: Char = minStr[i]
            for (str in strs) {
                if (currentChar != str[i]) break@outer
            }
            prefixLength++
        }

        return minStr.substring(0, prefixLength)
    }
}