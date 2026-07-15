package solutions

import kotlin.math.abs

// https://leetcode.com/problems/3sum-closest/description/

class ThreeSumClosest {

    fun threeSumClosest(nums: IntArray, target: Int): Int {
        var result = nums[0] + nums[1] + nums[2]
        val s = nums.sorted()

        for (i in 0..s.lastIndex-2) {
            var left = i+1
            var right = s.lastIndex

            while (left < right) {
                val sum = s[i] + s[left] + s[right]
                val targetDiff = abs(sum - target)
                val resultDiff = abs(result - target)
                if (targetDiff == 0) {
                    return sum
                } else if (targetDiff < resultDiff) {
                    result = sum
                }

                if (sum < target) {
                    left++
                } else {
                    right--
                }
            }
        }

        return result
    }

}