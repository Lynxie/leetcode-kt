package solutions

// https://leetcode.com/problems/roman-to-integer/description/

class RomanToInteger {

    val romanMapping = mapOf<Char, Int>(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000,
    )

    fun romanToInt(s: String): Int {
        var result = 0
        var prevInt: Int? = null

        s.forEach { ch ->
            val currentInt = romanMapping[ch]!!
            result += currentInt
            if (prevInt != null && currentInt > prevInt) {
                result -= prevInt * 2
            }
            prevInt = currentInt
        }

        return result
    }

}