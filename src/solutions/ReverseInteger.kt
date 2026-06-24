package solutions

import kotlin.math.absoluteValue
import kotlin.math.sign

// https://leetcode.com/problems/reverse-integer/description/

class ReverseInteger {
    fun reverse(x: Int): Int {
        return try {
            x.absoluteValue.toString().reversed().toInt() * x.sign
        } catch (_: NumberFormatException) {
            0
        }
    }
}