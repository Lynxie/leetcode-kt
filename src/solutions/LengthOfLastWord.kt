package solutions

// https://leetcode.com/problems/length-of-last-word/description/

class LengthOfLastWord {

    fun lengthOfLastWord(s: String): Int {
        var lastWordLen = 0

        for (i in s.length - 1 downTo 0) {
            if (s[i] != ' ') {
                lastWordLen++
            } else if (lastWordLen > 0) {
                break
            }
        }

        return lastWordLen
    }

    fun lengthOfLastWord2(s: String): Int {
        return s.trim().replace("\\s+".toRegex(), " ").split(" ").last().length
    }

}