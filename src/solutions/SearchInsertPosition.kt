package solutions

// https://leetcode.com/problems/search-insert-position/

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex

        while (left <= right) {
            val mid = (left + right) / 2
            if (nums[mid] == target) {
                return mid
            }

            if ((right - left) <= 1) {
                return when {
                    nums[mid] > target -> mid
                    nums[right] < target -> right + 1
                    else -> mid + 1
                }
            }

            if (nums[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return -1
    }

    fun searchInsert2(nums: IntArray, target: Int): Int {
        for (i in nums.indices) {
            if (nums[i] >= target) {
                return i
            }
        }

        return nums.size
    }

}