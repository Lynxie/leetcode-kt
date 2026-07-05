package solutions

// https://leetcode.com/problems/plus-one/description/

class LargeIntegerPlusOne {
    fun plusOne(digits: IntArray): IntArray {

        for (i in digits.indices.reversed()) {
            if (digits[i] == 9) {
                digits[i] = 0
            } else {
                digits[i]++
                return digits
            }
        }

        return intArrayOf(1).plus(digits)
    }

    fun plusOne2(digits: IntArray): IntArray {
        var result = digits.copyOf().reversedArray().plus(0)

        var plusToNext = true
        for (i in result.indices) {
            if (!plusToNext) {
                break
            }

            if (result[i] == 9) {
                result[i] = 0
                plusToNext = true
            } else {
                result[i]++
                plusToNext = false
            }
        }

        if (result.last() == 0) {
            result = result.copyOf(result.size - 1)
        }

        return result.reversedArray()
    }

}