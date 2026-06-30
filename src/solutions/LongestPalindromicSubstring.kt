package solutions

// https://leetcode.com/problems/longest-palindromic-substring/description/

class LongestPalindromicSubstring {

    fun longestPalindrome(s: String): String {
        var longest = s[0].toString()
        val range = s.indices
        val candidates = mutableListOf<Pair<Int, Int>>()

        for (i in range) {
            var offset = 1
            while (i + offset in range) {
                val dir = s.substring(i, i + offset + 1)
                val rev = dir.reversed()
                if (dir == rev) {
                    candidates.add(Pair(i, i + offset))
                }
                if (++offset >= 3) {
                    break
                }
            }
        }

        for ((start, end) in candidates) {
            var sti = start
            var eni = end
            while (sti in range && eni in range && s[sti] == s[eni]) {
                val candidateString = s.substring(sti, eni + 1)
                if (candidateString.length > longest.length) {
                    longest = candidateString
                }
                sti--
                eni++
            }
        }

        return longest
    }

}