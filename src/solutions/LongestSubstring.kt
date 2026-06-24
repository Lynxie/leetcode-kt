package solutions

// https://leetcode.com/problems/longest-substring-without-repeating-characters/

class LongestSubstring {
    fun lengthOfLongestSubstring(s: String): Int {
        var longestString = ""
        var currentString = ""

        s.forEach { char ->
            if (currentString.contains(char)) {
                val pos = currentString.lastIndexOf(char)
                currentString = currentString.substring(pos + 1)
            }
            currentString += char

            if (longestString.length < currentString.length) {
                longestString = currentString
            }
        }

        return longestString.length
    }
}